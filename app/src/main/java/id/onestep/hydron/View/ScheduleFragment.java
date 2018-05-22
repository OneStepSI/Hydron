package id.onestep.hydron.View;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import id.onestep.hydron.Adapter.schedule_adapter;
import id.onestep.hydron.Model.m_schedule;
import id.onestep.hydron.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleFragment extends Fragment {
    private ListView listView;
    private schedule_adapter adapter;
    private List<m_schedule> mList;
    private FloatingActionButton fab;

    public ScheduleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);
        listView = (ListView) view.findViewById(R.id.list_schedule);
        mList = new ArrayList<>();

        mList.add(new m_schedule(1,"Sawi","Panen"));
        mList.add(new m_schedule(1,"Kangkung","Bibit"));
        mList.add(new m_schedule(1,"Bayam","Tanam"));

        adapter = new schedule_adapter(getActivity(),mList);
        listView.setAdapter(adapter);
        fab = (FloatingActionButton) view.findViewById(R.id.fabschedule);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AddSchedule.class);
                startActivity(i);
            }
        });
        return view;
    }

}
