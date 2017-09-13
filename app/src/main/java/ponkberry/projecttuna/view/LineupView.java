package ponkberry.projecttuna.view;

import android.app.FragmentManager;
import android.content.Context;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import ponkberry.projecttuna.R;
import ponkberry.projecttuna.adapter.ListViewAdapter;
import ponkberry.projecttuna.FantasyActivity;
import ponkberry.projecttuna.object.LineUp;

public class LineupView extends LinearLayout implements AdapterView.OnItemClickListener {

    private final View view;
    private View view2;
    private LayoutInflater inflater;
    private FantasyActivity context;
    private ListViewAdapter adapter;
    private ArrayList<LineUp> playerList = new ArrayList<>();
    private ListView listView;

    public LineupView(Context context) {
        super(context);
        this.context = (FantasyActivity) context;
        inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.list_view, this);
        ButterKnife.bind(this, view);
        listView = (ListView) findViewById(R.id.lineup_listview);
        initializeList();
    }

    private void initializeList() {
        view2 = inflater.inflate(R.layout.list_header, this);
        populateGameList(playerList);
        adapter = new ListViewAdapter(this.context, playerList);
        View header = LayoutInflater.from(view2.getContext())
                .inflate(R.layout.list_header, listView, false);
        TextView awayTeam = (TextView) header.findViewById(R.id.tv_away_team);
        awayTeam.setText("Marlins");
        TextView homeTeam = (TextView) header.findViewById(R.id.tv_home_team);
        homeTeam.setText("Braves");
        listView.addHeaderView(header);
        listView.setAdapter(adapter);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        adapter.notifyDataSetChanged();
    }

    private void populateGameList(ArrayList<LineUp> list) {
        list.add(new LineUp("Gordon", "2B", "Inciarte", "CF"));
        list.add(new LineUp("Stanton", "RF", "Albies", "2B"));
        list.add(new LineUp("Yelich", "CF", "Freeman, F.", "1B"));
        list.add(new LineUp("Ozuna", "LF", "Kemp", "LF"));
        list.add(new LineUp("Realmuto", "1B", "Suzuki", "C"));
        list.add(new LineUp("Anderson", "3B", "Swanson", "SS"));
        list.add(new LineUp("Ellis", "C", "Camargo", "3B"));
        list.add(new LineUp("Rojas", "SS", "Adams, L.", "RF"));
        list.add(new LineUp("Conley", "P", "Fried", "P"));


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
