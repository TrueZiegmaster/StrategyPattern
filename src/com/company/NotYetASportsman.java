package com.company;

public class NotYetASportsman extends SportsMan{
    public NotYetASportsman(){
        runBehavior = new RunRefuse();
        playChessBehavior = new ChessRefuse();
    }

    public void display(){
        System.out.println("I'm not a sportsman yet");
    }
}
