
package ponkberry.projecttuna.model.util.home;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Home {

    @SerializedName("players")
    @Expose
    private List<HomePlayer> homePlayers = null;

    public List<HomePlayer> getHomePlayers() {
        return homePlayers;
    }

    public void setHomePlayers(List<HomePlayer> homePlayers) {
        this.homePlayers = homePlayers;
    }

}
