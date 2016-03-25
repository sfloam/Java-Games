/*
 * Scott Floam
 * Floam@nyu.edu
 * 516-314-4490
 * 
 * StrategySwapMode - the first move by the Computer is random. If the Human's 
 * winning record surpasses his/her losing record, the Computer will attempt
 * play a move that beats the Human's most frequently used move. If the Human's 
 * tying record surpasses his/her winning record, the Computer will start to
 * use random moves. Otherwise, the Computer will use the Human's previous move.
 * 
 */
 
package games.rps;

public class StrategySwapMode extends Game {
	StrategySwapMode() {
		super();
	}

	protected void startRound() {
		System.out.println("\nStrategy Swap Mode\n");
		roundCounter++;
		System.out.println("\n...Beginning Round #" + roundCounter + "...\n");

		if (roundCounter == 1) {
			userOne.setMove();
			userTwo.setMove();
		} else if (ties > wins) {
			userOne.setMove();
			userTwo.setMove();
		} else if ((wins - losses ) > 0) {
			userTwo.setMove(((userOne.getMostFrequentMove())+1)%3); /*beat the most frequent move*/
			userOne.setMove();
		} else {
			userTwo.setMove(userOne.getPreviousMove());
			userOne.setMove();
		}

		Integer humanChoice = userOne.getMoveAsInteger();
		Integer compChoice = userTwo.getMoveAsInteger();

		setResult(humanChoice, compChoice);

		printResults();
	}
}
