package ponkberry.projecttuna.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ponkberry.projecttuna.R;
import ponkberry.projecttuna.model.util.home.HomePlayer;

public class FantasyListViewAdapter extends BaseAdapter {

    private Context mContext;
    private final LayoutInflater mInflater;
    private final List<HomePlayer> listResult;

    public FantasyListViewAdapter(Context context, List<HomePlayer> listResult) {
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
        ViewHolder2 holder;
        if(convertView == null) {
            convertView = mInflater.inflate(R.layout.fantasy_list_item, parent, false);
            holder = new ViewHolder2();
            holder.textView1 = (TextView) convertView.findViewById(R.id.fantasy_player_name);
            holder.textView2 = (TextView) convertView.findViewById(R.id.fantasy_player_stat);
            holder.textView3 = (TextView) convertView.findViewById(R.id.fantasy_player_score);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder2) convertView.getTag();
        }
        holder.hp = listResult.get(position);

        holder.textView1.setText("ads"+holder.hp.getName());
        holder.textView2.setText(holder.hp.getTeam());
        holder.textView3.setText(holder.hp.getName());

        return convertView;
    }
}

