package id.onestep.hydron.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import id.onestep.hydron.Model.m_shop_all;
import id.onestep.hydron.R;

public class shop_all_adapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<m_shop_all> list;

    public shop_all_adapter(Activity activity, List<m_shop_all> list) {
        this.activity = activity;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(activity, R.layout.grid_shop_all, null);
        m_shop_all m = list.get(position);
        ImageView image = (ImageView) view.findViewById(R.id.image);
        image.setImageResource(m.getImage());
        TextView title = (TextView) view.findViewById(R.id.title);
        title.setText(m.getTitle());
        TextView other = (TextView) view.findViewById(R.id.price);
        other.setText(m.getPrice());
        TextView stok = (TextView)view.findViewById(R.id.stok);
        stok.setText(m.getStok());
        view.setTag(m.getId());
        return view;
    }
}
