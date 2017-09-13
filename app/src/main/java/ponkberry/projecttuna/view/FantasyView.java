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
        populateGameList(gameList);
//        gameList = new Parser().getHomeTeam(context);
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
        list.add(new HomePlayer("Fried SP", "3.2IP, 6H, 3ER, 1BB, 3K", "1")); //SP
        list.add(new HomePlayer("J. Ramirez RP", "1.0IP, 1H, 0ER, 0BB, 1K", "2")); //RP
        list.add(new HomePlayer("K. Suzuki C", "3TB, 2R", "5")); //C
        list.add(new HomePlayer("Realmuto 1B", "4TB, 2RBI, 1R", "7")); //1B
        list.add(new HomePlayer("Albies 2B", "1H, 1RBI", "2")); //2B
        list.add(new HomePlayer("B. Anderson 3B", "2H, 1RBI, 1R", "4")); //3B
        list.add(new HomePlayer("Swanson SS", "1R, 3BB", "4")); //SS
        list.add(new HomePlayer("Ozuna LF", "1TB, 1R", "2")); //LF
        list.add(new HomePlayer("Inciarte CF", "2TB, 1RBI, 1BB", "4")); //CF
        list.add(new HomePlayer("Stanton RF", "4TB, 1RBI, 1R", "6")); //RF
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
