/*
 * Scott Floam
 * Floam@nyu.edu
 * 516-314-4490
 * 
 * Computer - a subclass of Player with properties that are defined by each game mode 
 */

package games.rps;

class Computer extends Player {
	Computer() {
		super();
	}

	protected void setMove() {
		this.moveAsInteger = (int) (Math.random() * numberOfChoices);
	}

	protected void setMove(Integer modeValue) {
		this.moveAsInteger = modeValue;
	}

}
