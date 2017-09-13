package ponkberry.projecttuna.model.util;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Schedule {

    @SerializedName("gameentry")
    @Expose
    private List<Gameentry> gameentry = null;

    public List<Gameentry> getGameentry() {
        return gameentry;
    }

    public void setGameentry(List<Gameentry> gameentry) {
        this.gameentry = gameentry;
    }

}