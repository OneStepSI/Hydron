package id.onestep.hydron.Adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

import id.onestep.hydron.Model.m_schedule;
import id.onestep.hydron.R;

public class schedule_adapter extends BaseAdapter {
    private Activity activity;
    private Inflater inflater;
    private List<m_schedule> list;

    public schedule_adapter(Activity activity, List<m_schedule> list) {
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
        View view = View.inflate(activity, R.layout.list_schedule,null);
        m_schedule m = list.get(position);
        TextView scheduleTitle = (TextView) view.findViewById(R.id.scheduleTitle);
        scheduleTitle.setText(m.getScheduleTitle());
        TextView scheduleStatus = (TextView) view.findViewById(R.id.scheduleStatus);
        scheduleStatus.setText(m.getScheduleStatus());
        view.setTag(m.getId());
        return view;
    }
}
