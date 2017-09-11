package ponkberry.projecttuna.model.team;


public class Hitter extends Player{

    private int runs; // Player got to home
    private int rbi; // Runs Batted In - Occurs when a player hits the ball and a player scores on that hit
    private int stolenBases; // Advancing bases on a pitch
    private int totalBases; // Single = 1, Double = 2, Triple = 3, HR = 4

    public Hitter(int runs, int rbi, int stolenBases, int totalBases){
        this.runs = runs;
        this.rbi = rbi;
        this.stolenBases = stolenBases;
        this.totalBases = totalBases;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getRbi() {
        return rbi;
    }

    public void setRbi(int rbi) {
        this.rbi = rbi;
    }

    public int getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public int getTotalBases() {
        return totalBases;
    }

    public void setTotalBases(int totalBases) {
        this.totalBases = totalBases;
    }
}
