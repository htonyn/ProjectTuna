
package ponkberry.projecttuna.model.util.away;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HitterStats {

    @SerializedName("runs")
    @Expose
    private Integer runs;
    @SerializedName("rbi")
    @Expose
    private Integer rbi;
    @SerializedName("totalBases")
    @Expose
    private Integer totalBases;
    @SerializedName("stolenBases")
    @Expose
    private Integer stolenBases;
    @SerializedName("walks")
    @Expose
    private Integer walks;

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Integer getRbi() {
        return rbi;
    }

    public void setRbi(Integer rbi) {
        this.rbi = rbi;
    }

    public Integer getTotalBases() {
        return totalBases;
    }

    public void setTotalBases(Integer totalBases) {
        this.totalBases = totalBases;
    }

    public Integer getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(Integer stolenBases) {
        this.stolenBases = stolenBases;
    }

    public Integer getWalks() {
        return walks;
    }

    public void setWalks(Integer walks) {
        this.walks = walks;
    }

}
