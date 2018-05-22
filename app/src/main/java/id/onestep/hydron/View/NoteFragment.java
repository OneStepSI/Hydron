package id.onestep.hydron.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xyz.step.FlowViewVertical;

import java.util.HashMap;
import java.util.Map;

import id.onestep.hydron.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NoteFragment extends Fragment {

    private FlowViewVertical vflow;
    public NoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_note, container, false);
        vflow = (FlowViewVertical) view.findViewById(R.id.vflow);
        vflow.setProgress(4,4, new String[]{"Penjualan sawi\nRp.100.000","Penjualan pipa\nRp. 50.000","Penjualan sawi\nRp.100.000","Penjualan pipa\nRp. 50.000"}, null);
        Map<String,String> map = new HashMap();
        map.put("#ABCB89","#ABCB89");
        vflow.setKeyColor(map);
        return view;
    }

}
