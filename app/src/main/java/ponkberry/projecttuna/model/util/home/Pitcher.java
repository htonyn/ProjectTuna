
package ponkberry.projecttuna.model.util.home;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pitcher {

    @SerializedName("outsRecorded")
    @Expose
    private String outsRecorded;
    @SerializedName("posName")
    @Expose
    private String posName;
    @SerializedName("hits")
    @Expose
    private Integer hits;
    @SerializedName("earnedRuns")
    @Expose
    private Integer earnedRuns;
    @SerializedName("walks")
    @Expose
    private Integer walks;
    @SerializedName("strikeouts")
    @Expose
    private Integer strikeouts;
    @SerializedName("battersHit")
    @Expose
    private Integer battersHit;

    public String getOutsRecorded() {
        return outsRecorded;
    }

    public void setOutsRecorded(String outsRecorded) {
        this.outsRecorded = outsRecorded;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(Integer earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public Integer getWalks() {
        return walks;
    }

    public void setWalks(Integer walks) {
        this.walks = walks;
    }

    public Integer getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(Integer strikeouts) {
        this.strikeouts = strikeouts;
    }

    public Integer getBattersHit() {
        return battersHit;
    }

    public void setBattersHit(Integer battersHit) {
        this.battersHit = battersHit;
    }

}
