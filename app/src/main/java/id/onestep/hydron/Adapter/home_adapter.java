package id.onestep.hydron.Adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

import id.onestep.hydron.Model.m_home;
import id.onestep.hydron.R;

public class home_adapter extends BaseAdapter{
    private Activity activity;
    private Inflater inflater;
    private List<m_home> list;

    public home_adapter(Activity activity, List<m_home> list) {
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
        View view = View.inflate(activity, R.layout.list_home,null);
        m_home m = list.get(position);
        ImageView cardImage = (ImageView) view.findViewById(R.id.cardImage);
        cardImage.setImageResource(m.getCardImage());
        TextView cardTitle = (TextView) view.findViewById(R.id.cardTitle);
        cardTitle.setText(m.getCardTitle());
        TextView cardUrl = (TextView) view.findViewById(R.id.cardUrl);
        cardUrl.setText(m.getCardUrl());
        TextView cardViews = (TextView) view.findViewById(R.id.cardViews);
        cardViews.setText(m.getCardViews());
        TextView cardDesc = (TextView) view.findViewById(R.id.cardDesc);
        cardDesc.setText(m.getCardDesc());
        view.setTag(m.getId());
        return view;
    }
}
