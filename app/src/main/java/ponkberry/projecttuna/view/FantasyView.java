package ponkberry.projecttuna.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ponkberry.projecttuna.FantasyActivity;
import ponkberry.projecttuna.R;
import ponkberry.projecttuna.adapter.FantasyListViewAdapter;
import ponkberry.projecttuna.model.util.Parser;
import ponkberry.projecttuna.model.util.home.HomePlayer;


public class FantasyView extends LinearLayout implements AdapterView.OnItemClickListener {

    private final View view;
    private View view2;
    private LayoutInflater inflater;
    private FantasyActivity context;
    private FantasyListViewAdapter adapter;
    private List<HomePlayer> gameList = new ArrayList<>();
    private ListView listView;

    public FantasyView(Context context) {
        super(context);
        this.context = (FantasyActivity) context;
        inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.list_view, this);
        listView = (ListView) findViewById(R.id.lineup_listview);
        initializeList();
    }

    private void initializeList() {
        view2 = inflater.inflate(R.layout.list_header, this);
//        populateGameList(gameList);
        gameList = new Parser().getHomeTeam(context);
        System.out.println(gameList.toString());
        adapter = new FantasyListViewAdapter(this.context, gameList);
        View header = LayoutInflater.from(view2.getContext())
                .inflate(R.layout.list_header, listView, false);
        listView.setAdapter(adapter);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        adapter.notifyDataSetChanged();
    }

    private void populateGameList(List<HomePlayer> list) {
        //list = new Parser().getHomeTeam();
        list.add(new HomePlayer("Inciarte", "Braves", "Yes"));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
