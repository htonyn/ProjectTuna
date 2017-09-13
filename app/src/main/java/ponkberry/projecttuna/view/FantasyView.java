package ponkberry.projecttuna.view;

import android.app.FragmentManager;
import android.content.Context;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import ponkberry.projecttuna.FantasyActivity;
import ponkberry.projecttuna.R;
import ponkberry.projecttuna.adapter.ListViewAdapter;
//import ponkberry.projecttuna.gameobject.GameObject;
import ponkberry.projecttuna.object.LineUp;
import ponkberry.projecttuna.object.Team;


public class FantasyView extends LinearLayout implements AdapterView.OnItemClickListener {

    private final View view;
    private View view2;
    private LayoutInflater inflater;
    private FantasyActivity context;
    private ListViewAdapter adapter;
    private ArrayList<LineUp> gameList = new ArrayList<>();
    private ListView listView;

    public FantasyView(Context context) {
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
        populateGameList(gameList);
        adapter = new ListViewAdapter(this.context, gameList);
        View header = LayoutInflater.from(view2.getContext())
                .inflate(R.layout.list_header, listView, false);
        listView.setAdapter(adapter);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        adapter.notifyDataSetChanged();
    }

    private void populateGameList(ArrayList<LineUp> list) {
//        list.add(new GameObject("Angels that Kill", 410680, "Demo", 2, 1, "0.1 Hours"));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
