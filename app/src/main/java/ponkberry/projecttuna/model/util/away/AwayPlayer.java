
package ponkberry.projecttuna.model.util.away;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AwayPlayer {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("team")
    @Expose
    private String team;
    @SerializedName("position")
    @Expose
    private Position position;
    @SerializedName("hitterStats")
    @Expose
    private HitterStats hitterStats;
    @SerializedName("pitcher")
    @Expose
    private Pitcher pitcher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public HitterStats getHitterStats() {
        return hitterStats;
    }

    public void setHitterStats(HitterStats hitterStats) {
        this.hitterStats = hitterStats;
    }

    public Pitcher getPitcher() {
        return pitcher;
    }

    public void setPitcher(Pitcher pitcher) {
        this.pitcher = pitcher;
    }

}
