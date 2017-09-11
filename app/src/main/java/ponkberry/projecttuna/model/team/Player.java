package ponkberry.projecttuna.model.team;


class Player {

    private String name;
    private int position;
    private int score;

    Player(){}

    public Player(String name, int position, int score){
        this.name = name;
        this.position = position;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
