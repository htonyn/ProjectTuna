package ponkberry.projecttuna.model.team;

enum Position {

    RP, SP, C, FB, SB, TB, SS, LF, CF, RF;

    public int getPosition(){
        return this.ordinal();
    }

}