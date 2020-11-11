package com.company;

public class ChessCommonPlayer extends SportsMan{
    public ChessCommonPlayer(){
        runBehavior = new RunRefuse();
        playChessBehavior = new ChessCommon();
    }

    public void display(){
        System.out.println("I'm a chess player");
    }
}
