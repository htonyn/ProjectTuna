package ponkberry.projecttuna.model;

import ponkberry.projecttuna.model.player.Player;


public class Team {

        private Player[] team;

        public Team(){
            team = new Player[10];
        }

    public Player[] getTeam() {
        return team;
    }

    public void setTeam(Player[] team) {
        this.team = team;
    }

    public boolean addPlayer(Player player){
        if(team[player.getPosition()] != null){
            return false;
        }
        team[player.getPosition()] = player;
        return true;
    }
}
