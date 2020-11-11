package com.company;

public class ChessRapidPlayer extends SportsMan{
    public ChessRapidPlayer(){
        runBehavior = new RunRefuse();
        playChessBehavior = new ChessRapid();
    }

    public void display(){
        System.out.println("I'm a rapid chess player");
    }
}
