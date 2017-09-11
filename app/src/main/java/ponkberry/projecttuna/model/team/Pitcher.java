package ponkberry.projecttuna.model.team;

public class Pitcher extends Player {

    private double inningsPitched;
    private int hits;
    private int earnedRuns;
    private int walks;
    private int strikeOuts;

    public Pitcher(double inningsPitched, int hits, int earnedRuns, int walks, int strikeOuts) {
        this.inningsPitched = inningsPitched;
        this.hits = hits;
        this.earnedRuns = earnedRuns;
        this.walks = walks;
        this.strikeOuts = strikeOuts;
    }

    public double getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(double inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getStrikeOuts() {
        return strikeOuts;
    }

    public void setStrikeOuts(int strikeOuts) {
        this.strikeOuts = strikeOuts;
    }
}
