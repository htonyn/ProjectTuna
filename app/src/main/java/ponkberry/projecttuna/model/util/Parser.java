package ponkberry.projecttuna.model.util;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static void main(String[]args){
        System.out.println(getSchedule().get(0).getAwayTeam().getCity());
    }

    public static List<Gameentry> getSchedule() {
        Gson gson = new Gson();
        BufferedReader br = null;
        List<Gameentry> games = new ArrayList<>();
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\chemm\\AndroidStudioProjects\\ProjectTuna\\app\\src\\main\\java\\ponkberry\\projecttuna\\model\\Schedule.json"));
            Schedule schedule = gson.fromJson(br, Schedule.class);

            if(schedule != null){
                for(Gameentry game : schedule.getGameentry()){
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



}
