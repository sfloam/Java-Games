/* 
 * Scott Floam
 * Floam@nyu.edu
 * 516-314-4490
 * 
 * Human - a subclass of Player with properties that allow for input by a user
 * 
 */
 
package games.rps;

class Human extends Player {
	Human() {
		super();
	}

	protected void setMove() {
		boolean keepRunning = true;
		String userMove;

		do {
			System.out.print("Choose (R)ock, (P)aper, or (S)cissors: ");
			userMove = input.next();
			if (userMove.equalsIgnoreCase("R")) {
				this.moveAsInteger = 0;
				keepRunning = false;
			} else if (userMove.equalsIgnoreCase("P")) {
				this.moveAsInteger = 1;
				keepRunning = false;
			} else if (userMove.equalsIgnoreCase("S")) {
				this.moveAsInteger = 2;
				keepRunning = false;
			} else {
				System.out.println("\nYou entered an incorrect value! "
						+ "Please only enter R , P , or S in this field.\n");
			}
		} while (keepRunning);

		userMove = null;
		moveCount.set(moveAsInteger, (moveCount.get(moveAsInteger) + 1));
		this.previousMove = moveAsInteger;
		setMostFrequentMove();
	}

	protected void setMove(Integer modeValue) {
		this.setMove();
	}

	protected void setMostFrequentMove() {
		int highestVal = moveCount.get(0);
		int highestIndex = 0;

		for (int i = 1; i < moveCount.size(); i++) {
			if (moveCount.get(i) > highestVal) {
				highestIndex = i;
				highestVal = moveCount.get(i);
			}
		}
		this.mostFrequentMove = highestIndex;
	}
}
