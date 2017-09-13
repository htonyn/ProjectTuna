package ponkberry.projecttuna;

import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;

import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {
    private Button bt1;
    private Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initialView();
        initialListener();
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
