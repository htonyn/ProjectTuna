package ponkberry.projecttuna.object;

public class LineUp {
    String name1;
    String pos1;
    String name2;
    String pos2;
    public LineUp(String name1, String pos1, String name2, String pos2) {
        this.name1 = name1;
        this.name2 = name2;
        this.pos1 = pos1;
        this.pos2 = pos2;

    }

    public String getAwayName() {
        return name1;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getAwayPos() {
        return pos1;
    }

    public void setPos1(String pos1) {
        this.pos1 = pos1;
    }

    public String getHomePos() {
        return pos2;
    }

    public void setPos2(String pos2) {
        this.pos2 = pos2;
    }

    public String getHomeName() {
        return name2;
    }
    public void setName2(String name2) {
        this.name2 = name2;
    }
}
