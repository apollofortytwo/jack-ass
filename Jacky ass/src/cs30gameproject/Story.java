package cs30gameproject;

import java.util.ArrayList;

public class Story {
	/**
	 * Makes all the Scenarios and Options
	 * @param player (The player in the story)
	 * @return a list of all the Scenarios
	 */
	public static ArrayList<Scenario> getStory(Player player) {
		ArrayList<Scenario> story = new ArrayList<Scenario>();
		//Starting Scenario
		Scenario start = new Scenario(
				"blah blah blah... (you have picked up an item)",player);
		start.options.add(new Option("",
				"", ""));
		start.options.get(0).pickup = new Equipment("Pipe",
				"an old rusted pipe", 5, 0);
		story.add(start);
		//First Choice
		Scenario scen1 = new Scenario(
				"you see two doors, one on the left and one on the right, which one do you open?",player);
		start.options.get(0).next = scen1;
		
		scen1.options.add(new Option("a", "Left Door", "You open the left door and find a jacket"));
		scen1.options.get(0).pickup = new Equipment("Jacket",
				"A dirty jacket", 0, 5);
		scen1.options.add(new Option("b", "Right Door","you open the Right Door and find some food"));
		scen1.options.get(1).pickup = new Consumable("Food",
				"canned food", 50);
		
		story.add(scen1);
		//Second Choice
		Scenario scen2 = new Scenario("you walk around until you see a dead body, do you loot it for supplies?",player);
		scen1.options.get(0).next = scen2;
		scen1.options.get(1).next = scen2;
		
		scen2.options.add(new Option("a", "Loot the body", "You try to loot the body but it bites you and kills you"));
		scen2.options.get(0).value = 0;
		scen2.options.add(new Option("b", "Don't loot the body", "You walk away from the body and trip. you drop an item"));
		scen2.options.get(1).drop = null;
		
		story.add(scen2);
		
		
		
		
		
		
		
		
		return story;
	}
	
}
