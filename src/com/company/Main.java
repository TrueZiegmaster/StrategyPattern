package com.company;

public class Main {
    public static void main(String[] args) {
	    SportsMan sprintRunner = new SprintRunner();
	    sprintRunner.startRunning();
	    sprintRunner.startChessGame();

		SportsMan notYetASportsman = new NotYetASportsman();
		notYetASportsman.startChessGame();
		notYetASportsman.setPlayChessBehavior(new ChessCommon());
		notYetASportsman.startChessGame();
    }
}
