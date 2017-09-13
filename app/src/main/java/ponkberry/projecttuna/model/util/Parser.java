package ponkberry.projecttuna.model.util;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import ponkberry.projecttuna.BaseActivity;
import ponkberry.projecttuna.FantasyActivity;
import ponkberry.projecttuna.R;
import ponkberry.projecttuna.model.util.away.Away;
import ponkberry.projecttuna.model.util.away.AwayPlayer;
import ponkberry.projecttuna.model.util.home.Home;
import ponkberry.projecttuna.model.util.home.HomePlayer;
import ponkberry.projecttuna.model.util.schedule.GameEntry;
import ponkberry.projecttuna.model.util.schedule.Schedule;

public class Parser extends BaseActivity {

    public static void main(String[] args) {
        //System.out.println(getSchedule().get(0).getId());
        //System.out.println(getAwayTeam().get(0).getName());
        //System.out.println(getHomeTeam().get(0).getName());

    }

    public static List<GameEntry> getSchedule() {
        Gson gson = new Gson();
        BufferedReader br = null;
        List<GameEntry> games = new ArrayList<>();
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\htony\\StudioProjects\\ProjectTuna\\app\\src\\main\\java\\ponkberry\\projecttuna\\model\\util\\schedule.json"));
            Schedule schedule = gson.fromJson(br, Schedule.class);

            if(schedule != null){
                for(GameEntry game : schedule.getGameEntry()){
                    games.add(game);
                }
            }
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return games;
    }

    public static List<HomePlayer> getHomeTeam(Context context) {
        Gson gson = new Gson();
        BufferedReader br = null;
        ArrayList<HomePlayer> homePlayers = new ArrayList<>();
        try{
            br = new BufferedReader(new InputStreamReader(context.getAssets().open("home.json")));
            //br = new BufferedReader(new FileReader("C:\\Users\\htony\\StudioProjects\\ProjectTuna\\app\\src\\main\\java\\ponkberry\\projecttuna\\model\\util\\home.json"));
            Home home = gson.fromJson(br, Home.class);

            if(home != null){
                for(HomePlayer homePlayer : home.getHomePlayers()){
                    homePlayers.add(homePlayer);
                }
            }
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return homePlayers;
    }

    public static List<AwayPlayer> getAwayTeam() {
        Gson gson = new Gson();
        BufferedReader br = null;
        ArrayList<AwayPlayer> awayPlayers = new ArrayList<>();
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\htony\\StudioProjects\\ProjectTuna\\app\\src\\main\\java\\ponkberry\\projecttuna\\model\\util\\away.json"));
            Away away = gson.fromJson(br, Away.class);

            if(away != null){
                for(AwayPlayer awayPlayer : away.getAwayPlayers()){
                    awayPlayers.add(awayPlayer);
                }
            }
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return awayPlayers;
    }



}
