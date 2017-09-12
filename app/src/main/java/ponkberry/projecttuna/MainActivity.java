package ponkberry.projecttuna;

import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import android.widget.ImageButton;

public class MainActivity extends BaseActivity {

    private ImageButton bt1;

    @OnClick(R.id.main_fantasy_bt)
    public void toFantasy() {
        toastShort("FUCK YOU");

//        toActivity(FantasyActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initialListener();
        initialView();
    }


    private void initialListener() {

    }
    private void initialView() {

    }
}
