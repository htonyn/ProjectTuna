package ponkberry.projecttuna.object;

import java.util.ArrayList;

public class Team {
    ArrayList<String> playerList;
    String teamName;

    public Team(String name, ArrayList<String> list) {
        playerList = list;
        teamName = name;
    }

    public ArrayList<String> getPlayerList() {
        return playerList;
    }
    public void setPlayerList(ArrayList<String> playerList) {
        this.playerList = playerList;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getTeamName() {
        return teamName;
    }
}
