package ponkberry.projecttuna;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

import ponkberry.projecttuna.adapter.MainViewPagerAdapter;
import ponkberry.projecttuna.view.FantasyView;
import ponkberry.projecttuna.view.LineupView;

public class FantasyActivity extends AppCompatActivity implements View.OnTouchListener, AdapterView.OnItemClickListener {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fantasy);
        initialView();
        initialListener();
        initialViewPager();
    }
    public void initialView() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tl_tab);
    }
    public void initialListener() {

    }
    public void initialViewPager() {
        ArrayList<View> viewList = new ArrayList<View>();
        viewList.add(new LineupView(this));
        viewList.add(new FantasyView(this));
        viewPager.setAdapter(new MainViewPagerAdapter(viewList));
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}