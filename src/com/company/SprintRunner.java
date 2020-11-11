package com.company;

public class SprintRunner extends SportsMan{
    public SprintRunner(){
        runBehavior = new RunSprint();
        playChessBehavior = new ChessRefuse();
    }

    public void display(){
        System.out.println("I'm a sprint runner");
    }
}
