

/*
 * Scott Floam
 * Floam@nyu.edu
 * 516-314-4490
 * 
 * Player- an abstract class containing the key components of a Player (Human/Computer)
 *
 */

package games.rps;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public abstract class Player {
	Scanner input = new Scanner(System.in);
	protected Integer previousMove;		
	protected Integer moveAsInteger;		/* numeric value associated with R/P/S */
	protected List<Integer> moveCount;  /* array containing frequency of R/P/S */
	protected Integer mostFrequentMove; 
	protected Integer numberOfChoices = 3;

	Player() {
	
		/* Creates empty ArrayList with {0,0,0} as opposed to {null,null,null} */
		this.moveCount = new ArrayList<Integer>(Collections.nCopies(numberOfChoices, 0));
		this.mostFrequentMove = (int) (Math.random() * numberOfChoices);
		this.previousMove = (int) (Math.random() * numberOfChoices);
	}

	protected Integer getMostFrequentMove() {
		return this.mostFrequentMove;
	}

	protected Integer getPreviousMove() {
		return this.previousMove;
	}

	protected Integer getMoveAsInteger() {
		return this.moveAsInteger;
	}

	abstract void setMove();

	abstract void setMove(Integer modeValue);
}
