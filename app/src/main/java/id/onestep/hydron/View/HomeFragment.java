package id.onestep.hydron.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        listView = (ListView) view.findViewById(R.id.list_home);
        mList = new ArrayList<>();

        mList.add(new m_home(1,R.mipmap.logo_apps,"hidroponik","google.com","130 views","absdlabskdlaslkdbaklsdbklasklabdslkbasdklbaskldbkalsbd\najsdljadsljklasd"));
        mList.add(new m_home(2,R.mipmap.logo_apps,"hidroponik","google.com","130 views","absdlabskdlaslkdbaklsdbklasklabdslkbasdklbaskldbkalsbd\najsdljadsljklasd"));
        mList.add(new m_home(3,R.mipmap.logo_apps,"hidroponik","google.com","130 views","absdlabskdlaslkdbaklsdbklasklabdslkbasdklbaskldbkalsbd\najsdljadsljklasd"));
        adapter = new home_adapter(getActivity(),mList);
        listView.setAdapter(adapter);
        return view;
    }

}
