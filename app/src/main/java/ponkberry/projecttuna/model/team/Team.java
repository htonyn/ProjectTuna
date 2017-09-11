package ponkberry.projecttuna.model.team;


public class Team {

    private Player[] team;
    private String username;

    public Team(String username){
        team = new Player[10];
        this.username = username;
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

    public void removePlayer(int position){
        team[position] = null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
