/* 
 * Scott Floam
 * Floam@nyu.edu
 * 516-314-4490
 * 
 * RandomMode - the Computer generates a random move in Random Mode. There 
 * is no strategy here.
 */
 
package games.rps;

public class RandomMode extends Game {
	RandomMode() {
		super();
	}

	protected void startRound() {
		System.out.println("\nRandom Mode\n");
		roundCounter++;
		System.out.println("\n...Beginning Round #" + roundCounter + "...\n");

		userOne.setMove();
		userTwo.setMove();

		Integer humanChoice = userOne.getMoveAsInteger();
		Integer compChoice = userTwo.getMoveAsInteger();

		setResult(humanChoice, compChoice);

		printResults();
	}
}
