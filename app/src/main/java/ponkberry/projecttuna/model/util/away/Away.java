
package ponkberry.projecttuna.model.util.away;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Away {

    @SerializedName("players")
    @Expose
    private List<AwayPlayer> awayPlayers = null;

    public List<AwayPlayer> getAwayPlayers() {
        return awayPlayers;
    }

    public void setAwayPlayers(List<AwayPlayer> awayPlayers) {
        this.awayPlayers = awayPlayers;
    }

}
