package ponkberry.projecttuna.model.util;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gameentry {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("originalDate")
    @Expose
    private String originalDate;
    @SerializedName("originalTime")
    @Expose
    private String originalTime;
    @SerializedName("delayedOrPostponedReason")
    @Expose
    private Object delayedOrPostponedReason;
    @SerializedName("date")
    @Expose
    private Object date;
    @SerializedName("time")
    @Expose
    private Object time;
    @SerializedName("awayTeam")
    @Expose
    private AwayTeam awayTeam;
    @SerializedName("homeTeam")
    @Expose
    private HomeTeam homeTeam;
    @SerializedName("location")
    @Expose
    private String location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOriginalDate() {
        return originalDate;
    }

    public void setOriginalDate(String originalDate) {
        this.originalDate = originalDate;
    }

    public String getOriginalTime() {
        return originalTime;
    }

    public void setOriginalTime(String originalTime) {
        this.originalTime = originalTime;
    }

    public Object getDelayedOrPostponedReason() {
        return delayedOrPostponedReason;
    }

    public void setDelayedOrPostponedReason(Object delayedOrPostponedReason) {
        this.delayedOrPostponedReason = delayedOrPostponedReason;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Object getTime() {
        return time;
    }

    public void setTime(Object time) {
        this.time = time;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}