
/*
 * Scott Floam
 * Floam@nyu.edu
 * 516-314-4490
 * 
 * FrequencyMode - the Computer will always play the Human's most frequently
 * used move.
 * 
 */
 
package games.rps;

class FrequencyMode extends Game {
	FrequencyMode() {
		super();
	}

	protected void startRound() {
		System.out.println("\nFrequency Mode\n");
		roundCounter++;
		System.out.println("\n...Beginning Round #" + roundCounter + "...\n");

		userOne.setMove();
		userTwo.setMove(userOne.getMostFrequentMove());

		Integer humanChoice = userOne.getMoveAsInteger();
		Integer compChoice = userTwo.getMoveAsInteger();

		setResult(humanChoice, compChoice);

		printResults();
	}
}
