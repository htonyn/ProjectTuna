package ponkberry.projecttuna.model.util.schedule;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Schedule {

    @SerializedName("GameEntry")
    @Expose
    private List<GameEntry> gameEntry = null;

    public List<GameEntry> getGameEntry() {
        return gameEntry;
    }

    public void setGameEntry(List<GameEntry> gameEntry) {
        this.gameEntry = gameEntry;
    }

}
