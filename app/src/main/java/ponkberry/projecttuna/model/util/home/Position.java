
package ponkberry.projecttuna.model.util.home;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Position {

    @SerializedName("posName")
    @Expose
    private String posName;
    @SerializedName("doublePlaysTurned")
    @Expose
    private Integer doublePlaysTurned;
    @SerializedName("OutfieldAssists")
    @Expose
    private Integer outfieldAssists;

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public Integer getDoublePlaysTurned() {
        return doublePlaysTurned;
    }

    public void setDoublePlaysTurned(Integer doublePlaysTurned) {
        this.doublePlaysTurned = doublePlaysTurned;
    }

    public Integer getOutfieldAssists() {
        return outfieldAssists;
    }

    public void setOutfieldAssists(Integer outfieldAssists) {
        this.outfieldAssists = outfieldAssists;
    }

}
