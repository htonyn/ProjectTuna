package ponkberry.projecttuna;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.VideoView;

import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

public class GameActivity extends AppCompatActivity {
    String userAnswer;
    String realAnswer = "Hammer";
    Button saw;
    Button drill;
    Button hammer;
    Button activeButton;

    String prepend = "You Chose: ";
    String append = "!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        VideoView videoView = (VideoView)findViewById(R.id.gamesVideo);
        String path = "android.resource://" + getPackageName() + "/" + ponkberry.projecttuna.R.raw.toolrace;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();


        drill = (Button)findViewById(R.id.Drill);
        drill.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                userAnswer = "Drill";
                drill.setBackgroundResource(R.drawable.mybuttonclicked);
                hideUnclickedButtons(R.id.Drill);
                activeButton = drill;
            }
        });
        saw = (Button)findViewById(R.id.Saw);
        saw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                userAnswer = "Saw";
                saw.setBackgroundResource(R.drawable.mybuttonclicked);
                hideUnclickedButtons(R.id.Saw);
                activeButton = saw;
            }
        });
        hammer = (Button)findViewById(R.id.Hammer);
        hammer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                userAnswer = "Hammer";
                hammer.setBackgroundResource(R.drawable.mybuttonclicked);
                hideUnclickedButtons(R.id.Hammer);
                activeButton = hammer;
            }
        });




        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                // TODO Auto-generated method stub
                if (userAnswer==realAnswer){
                    activeButton.setText("You Won!");
                    activeButton.setTextColor(Color.GREEN);
                }
                else{
                    activeButton.setText("Sorry, You Lost :(");
                    activeButton.setTextColor(Color.RED);
                }
                //write your code after complete video play
                try {
                    TimeUnit.SECONDS.sleep(5);
                    activeButton.setVisibility(View.GONE);
                    LinearLayout layout1 = (LinearLayout)findViewById(R.id.home_score);
                    LinearLayout layout2 = (LinearLayout)findViewById(R.id.away_score);
                    layout1.setVisibility(View.VISIBLE);
                    layout2.setVisibility(View.VISIBLE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void hideUnclickedButtons(int buttonClicked){
        int[] buttonArray = {R.id.Hammer,R.id.Drill, R.id.Saw};
        for (int i = 0; i<buttonArray.length;i++){
            if(buttonArray[i]!=buttonClicked){
                Button toDelete = (Button)findViewById(buttonArray[i]);
                toDelete.setVisibility(View.GONE);
            }
        }
        Button button = (Button)findViewById(buttonClicked);

        CharSequence text = prepend + button.getText()+ append;
        button.setText(text);
        button.setTextSize(34);
        prepend = "";
        append = "";

    }
}

