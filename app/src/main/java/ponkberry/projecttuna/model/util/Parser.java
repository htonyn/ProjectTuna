package ponkberry.projecttuna.model.util;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ponkberry.projecttuna.model.util.away.Away;
import ponkberry.projecttuna.model.util.away.AwayPlayer;
import ponkberry.projecttuna.model.util.home.Home;
import ponkberry.projecttuna.model.util.home.HomePlayer;
import ponkberry.projecttuna.model.util.schedule.GameEntry;
import ponkberry.projecttuna.model.util.schedule.Schedule;

public class Parser {

    public List<GameEntry> getSchedule() {
        Gson gson = new Gson();
        BufferedReader br = null;
        List<GameEntry> games = new ArrayList<>();
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\chemm\\AndroidStudioProjects\\ProjectTuna\\app\\src\\main\\java\\ponkberry\\projecttuna\\model\\Schedule.json"));
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

    public List<HomePlayer> getHomeTeam() {
        Gson gson = new Gson();
        BufferedReader br = null;
        List<HomePlayer> homePlayers = new ArrayList<>();
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\chemm\\AndroidStudioProjects\\ProjectTuna\\app\\src\\main\\java\\ponkberry\\projecttuna\\model\\Home.json"));
            Home home = gson.fromJson(br, Home.class);

            if(home != null){
                for(HomePlayer homePlayer : home.getHomePlayers()){
                    homePlayers.add(homePlayer);
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
        return homePlayers;
    }

    public static List<AwayPlayer> getAwayTeam() {
        Gson gson = new Gson();
        BufferedReader br = null;
        List<AwayPlayer> awayPlayers = new ArrayList<>();
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\chemm\\AndroidStudioProjects\\ProjectTuna\\app\\src\\main\\java\\ponkberry\\projecttuna\\model\\Home.json"));
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
