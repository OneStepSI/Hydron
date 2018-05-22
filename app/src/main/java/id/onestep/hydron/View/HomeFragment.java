package id.onestep.hydron.View;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.airbnb.lottie.L;

import java.util.ArrayList;
import java.util.List;

import id.onestep.hydron.Adapter.home_adapter;
import id.onestep.hydron.Model.m_home;
import id.onestep.hydron.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private ListView listView;
    private home_adapter adapter;
    private List<m_home> mList;
    private Button btnSimulate;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        listView = (ListView) view.findViewById(R.id.list_simulate);
        listView.setVisibility(View.GONE);
        btnSimulate = (Button) view.findViewById(R.id.btnSimulate);
        btnSimulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.setVisibility(View.VISIBLE);
            }
        });
        mList = new ArrayList<>();

        mList.add(new m_home(1, "Bibit Sawi","10.000"));
        mList.add(new m_home(2, "Pipa 3m", "50.000"));
        mList.add(new m_home(3,"Pompa Air","40.000"));
        adapter = new home_adapter(getActivity(),mList);
        listView.setAdapter(adapter);
        return view;
    }

}
