package cs30gameproject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Terminus implements Serializable {

	private static final long serialVersionUID = 1L;
	transient Scanner keyb = new Scanner(System.in);
	String input = "";
	int menuInput = 0;
	boolean gameOver = false;
	ArrayList<Scenario> newStory;

	public static void main(String[] args) {
		Terminus game = new Terminus();
		game.run();
	}

	public void run() {
		do {
			// print menu and loop until you get valid entry
			Art.printMenu();
			menuInput = Integer.parseInt(keyb.nextLine());
			if (menuInput == 1) {
				System.out.println("\nblah blah blah... (enter name)\n"); // Exposition
				String name = keyb.nextLine();
				Player me = new Player(name, 100, 5, 10);
				newStory = Story.getStory(me); //sets the story
				me.current = newStory.get(0); // Starting Scenario
				System.out.println(newStory.get(0).toString());
				me.pickupEQ((Equipment) newStory.get(0).options.get(0).pickup);
				do {
				System.out.println(newStory.get(1).toString());
				input = keyb.nextLine();
				newStory.get(1).getOption(input);
				} while (input.equalsIgnoreCase("i"));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				gameOver = true;
				/*
				 * System.out.println("Do you want to play again?(y/n)");
				 * playAgain = keyb.nextLine(); if
				 * (playAgain.equalsIgnoreCase("n")) { gameOver = true; }
				 */
			} else if (menuInput == 2) {
				Help.printHelp();
			} else if (menuInput == 3) {
				gameOver = true;
			}
		} while (gameOver == false);
	}

}
