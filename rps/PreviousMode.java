/*
 * Scott Floam
 * Floam@nyu.edu
 * 516-314-4490
 * 
 * PreviousMode - the Computer will always play the Human's previous move. 
 * The Human's first previous move is randomized and assigned within the
 * Player constructor because a previous move does not exist when no moves
 * have occurred.
 */

package games.rps;

class PreviousMode extends Game {
	PreviousMode() {
		super();
	}

	protected void startRound() {
		System.out.println("\nPrevious Mode\n");
		roundCounter++;
		System.out.println("\n...Beginning Round #" + roundCounter + "...\n");

		userTwo.setMove(userOne.getPreviousMove());
		userOne.setMove();

		Integer humanChoice = userOne.getMoveAsInteger();
		Integer compChoice = userTwo.getMoveAsInteger();

		setResult(humanChoice, compChoice);
		printResults();
	}
}
