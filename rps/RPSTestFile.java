/*
 * Scott Floam
 * Floam@nyu.edu
 * 516-314-4490
 * 
 * RPSTestFile - run this file to test out each mode. Users are prompted with two 
 * menu screens. The first menu screen will ask the user if they want to start a
 * new game, continue their existing game, or quit (continue is not an option
 * for the first run). The second menu screen asks the user which mode they 
 * would like to play with: Frequency Mode, Previous Mode, Random Mode, or 
 * Strategy Swap Mode. This program will account for inappropriate input. Starting
 * a new game will erase all scoring for each game type. The Continue option 
 * will maintain the user's score for each game mode (separately).
 * Please note, I wrote my code using the conventions of Oracle's Java Style guide. 
 * I am very flexible when it comes to adjusting my style to meet a team's 
 * needs. Enjoy!
 * 
 */

package games.rps;

import java.util.Scanner;

public class RPSTestFile {
	static int runCounter = 0;
	static Game freqModeGame = new FrequencyMode();
	static Game prevModeGame = new PreviousMode();
	static Game randModeGame = new RandomMode();
	static Game stratModeGame = new StrategySwapMode();

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		getMenuOne(input);
	}

	public static void getMenuOne(Scanner input) {
		boolean isValidMenu = true;
		String menuOption;
		while (isValidMenu) {
			System.out.println("--------------------------------------------\n");
			System.out.print("What would you like to do?\n"
							+ "\n\tN -  Start a new game"
							+ String.valueOf((runCounter > 0) ? "\n\tC - Continue game"
									: "")/* Hides Continue until first run completes */
									
							+ "\n\t" + "Q -  Quit\n\n" + "Enter Menu Choice (N, "
							+ String.valueOf((runCounter > 0) ? "C, " : "")+ "or Q): ");

			menuOption = input.next();
			System.out.println("\n--------------------------------------------");

			if (menuOption.equalsIgnoreCase("N")) {
				freqModeGame = new FrequencyMode();
				prevModeGame = new PreviousMode();
				randModeGame = new RandomMode();
				stratModeGame = new StrategySwapMode();
				validMenuTwo(input);
			} else if (menuOption.equalsIgnoreCase("C") && runCounter > 0) {
				validMenuTwo(input);
			} else if (menuOption.equalsIgnoreCase("Q")) {
				isValidMenu = false;
				System.out.println("You will now exit the program. Goodbye!");
			} else {
				System.out.println("You entered an invalid menu choice!"
						+ " Try again.");
			}
		}
	}

	public static void validMenuTwo(Scanner input) {
		runCounter++;
		boolean isValidMenu = true;
		while (isValidMenu) {
			System.out.print("\nWhich mode would you like to use?\n"
					+ "\n\tF - Use Frequency Mode"
					+ "\n\tP - Use Previous Mode" + "\n\tR - Use Random Mode"
					+ "\n\tS - Use Strategy Swap Mode"
					+ "\n\nEnter Menu Choice (F, P, R, or S): ");
			String menuOption = input.next();
			System.out.println("--------------------------------------------");

			if (menuOption.equalsIgnoreCase("F")) {
				freqModeGame.startRound();
				isValidMenu = false;
			} else if (menuOption.equalsIgnoreCase("P")) {
				prevModeGame.startRound();
				isValidMenu = false;
			} else if (menuOption.equalsIgnoreCase("R")) {
				randModeGame.startRound();
				isValidMenu = false;
			} else if (menuOption.equalsIgnoreCase("S")) {
				stratModeGame.startRound();
				isValidMenu = false;
			} else {
				System.out.println("You entered an invalid menu choice!"
						+ " Try again.");
			}
		}
	}
}
