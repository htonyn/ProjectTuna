package ponkberry.projecttuna;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import butterknife.ButterKnife;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends BaseActivity {
    private Button bt1;
    private Button bt2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initialView();
        initialListener();
        PackageManager m = getPackageManager();
        String s = getPackageName();
        try {
            PackageInfo p = m.getPackageInfo(s, 0);
            s = p.applicationInfo.dataDir;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("yourtag", "Error Package name not found ", e);
        }
        tv1 = (TextView) findViewById(R.id.potato);
//        tv1.setText(s);
    }

    private void initialListener() {
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), FantasyActivity.class);
                startActivity(intent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), GameActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initialView() {
        bt1 = (Button) findViewById(R.id.main_fantasy_bt);
        bt2 = (Button) findViewById(R.id.main_game_bt);
    }
}
