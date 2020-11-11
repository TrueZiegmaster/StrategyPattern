package com.company;

public class LongRunner extends SportsMan{
    public LongRunner(){
        runBehavior = new RunLong();
        playChessBehavior = new ChessRefuse();
    }

    public void display(){
        System.out.println("I'm a long runner");
    }
}
