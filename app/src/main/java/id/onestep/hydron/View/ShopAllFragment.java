package id.onestep.hydron.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import id.onestep.hydron.Adapter.shop_all_adapter;
import id.onestep.hydron.Model.m_shop_all;
import id.onestep.hydron.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopAllFragment extends Fragment {
    private GridView gridView;
    private List<m_shop_all> mGrid = new ArrayList<m_shop_all>();;
    private shop_all_adapter adapter;

    public ShopAllFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shop_all, container, false);
        mGrid.add(new m_shop_all(1, R.mipmap.logo_hydron1, "Produk 1", "Rp. 30,000","3 stok"));
        mGrid.add(new m_shop_all(2, R.mipmap.logo_hydron1, "Produk 2", "Rp. 50,000","4 stok"));
        ArrayList<String> grid = new ArrayList<>();

        this.gridView = (GridView) view.findViewById(R.id.grid);
        this.adapter = new shop_all_adapter(getActivity(), mGrid);
        this.gridView.setAdapter(adapter);
        return view;
    }

}
