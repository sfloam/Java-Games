/*
 * Scott Floam
 * Floam@nyu.edu
 * 516-314-4490
 * 
 * Game - an abstract class containing the key components of a game mode.
 * 
 */

package games.rps;

abstract class Game {
	protected int wins = 0;
	protected int losses = 0;
	protected int ties = 0;
	protected int roundCounter; /* Keeps track of each iteration */
	protected Player userOne;
	protected Player userTwo;

	Game() {
		this.userOne = new Human();
		this.userTwo = new Computer();
	}/* Allows for builds beyond the scope of Human VS. Computer */

	abstract void startRound();

	protected void setResult(Integer humanChoice, Integer compChoice) {

		Integer difference = humanChoice - compChoice;
		if (difference == 1 || difference == -2) {
			System.out.println("\nHuman Wins!");
			wins += 1;
		} else if (difference == 2 || difference == -1) {
			System.out.println("\nHuman Loses!");
			losses += 1;
		} else {
			System.out.println("\nWe have a tie!");
			ties += 1;
		}

		System.out.println("Human Played:" + setValueToStr(humanChoice));
		System.out.println("Computer Played:" + setValueToStr(compChoice));

	}/*
	  * Algorithm for winning/losing User:
	  * Human Choice - Computer Choice = difference
	  * Wins:(1, -2) Losses:(2, -1) Ties:0
	  */

	protected String setValueToStr(Integer playerChoice) {
		String choiceLetter = null;
		if (playerChoice == 0) {
			choiceLetter = "R";
		} else if (playerChoice == 1) {
			choiceLetter = "P";
		} else if (playerChoice == 2) {
			choiceLetter = "S";
		} else {
			choiceLetter = "ERROR!";
		}
		return choiceLetter; /* Helps user visualize move */
	}

	protected void printResults() {
		System.out.println("\nWins:" + wins + " Losses:" + losses + " Ties:"
				+ ties + "\n");
		//printDebugger();
	}

	protected void printDebugger() {
		System.out.println("Human Move:" + userOne.getMoveAsInteger());
		System.out.println("Computer Move:" + userTwo.getMoveAsInteger());
		System.out.println("[R, P, S]");
		System.out.println(userOne.moveCount);
	}/* Used for viewing numeric outputs and frequency counts */

}
