package com.company;

public abstract class SportsMan {

    RunBehavior runBehavior;
    PlayChessBehavior playChessBehavior;

    public SportsMan(){
        display();
    }

    public abstract void display();

    public void setRunBehavior(RunBehavior rb){
        runBehavior = rb;
    }

    public void setPlayChessBehavior(PlayChessBehavior pcb){
        playChessBehavior = pcb;
    }

    public void startRunning(){
        runBehavior.run();
    }

    public void startChessGame(){
        playChessBehavior.playChess();
    }
}
