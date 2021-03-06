package ponkberry.projecttuna.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import ponkberry.projecttuna.R;
import ponkberry.projecttuna.model.util.home.HomePlayer;
import ponkberry.projecttuna.object.LineUp;

public class ListViewAdapter extends BaseAdapter {

    private Context mContext;
    private final LayoutInflater mInflater;
    private final ArrayList<LineUp> listResult;

    public ListViewAdapter(Context context, ArrayList<LineUp> listResult) {
        mContext = context;
        this.listResult = listResult;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return listResult.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            convertView = mInflater.inflate(R.layout.lineup_list_item, parent, false);
            holder = new ViewHolder();
            holder.textView1 = (TextView) convertView.findViewById(R.id.text_app_id);
            holder.textView2 = (TextView) convertView.findViewById(R.id.text_app_name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.object = listResult.get(position);
        holder.textView1.setText(holder.object.getAwayName() + " " + holder.object.getHomePos());
        holder.textView2.setText(holder.object.getHomeName() + " " + holder.object.getHomePos());

        return convertView;
    }
}

