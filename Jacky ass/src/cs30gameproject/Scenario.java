package cs30gameproject;

import java.util.ArrayList;

/**
 * this class stores all the data and Options for each Scenario
 * 
 * @author 499072002
 *
 */
public class Scenario {
	Player player;
	String description, input;
	ArrayList<Option> options = new ArrayList<Option>();

	Scenario() {
		this("<Description>", null);
	}

	Scenario(String description, Player player) {
		this.player = player;
		this.description = description;
	}

	public String toString() {
		return "\n" + description + "\n" + this.printOptions();
	}

	public String printOptions() {
		String optionString = "";
		for (int i = 0; i < options.size(); i++) {
			optionString += options.get(i).toString() + "\n";
		}
		return optionString;
	}

	public Scenario getOption(String input) {
		if (input.equalsIgnoreCase("a")) {
			System.out.println(this.options.get(0).printResult());
			if (this.options.get(0).pickup != null && this.options.get(0).pickup instanceof Equipment ) { // If there is a pickup(Equipment)
				player.pickupEQ((Equipment) this.options.get(0).pickup); // add pickup to Equipment
			} else if (this.options.get(0).drop != null && this.options.get(0).drop instanceof Equipment) { // if there is a drop(Equipment)
				this.options.get(0).drop = player.inventory.equipment
				.get((int) (Math.random() * player.inventory.equipment.size()));
				player.dropEQ((Equipment) this.options.get(0).drop);
			}
			player.current = this.options.get(0).next;
			return this.options.get(0).next;
			// Option a
		} else if (input.equalsIgnoreCase("b")) {
			System.out.println(this.options.get(1).printResult());
			if (this.options.get(1).pickup != null) {
				player.pickupEQ((Equipment) this.options.get(1).pickup);
			} else if (this.options.get(1).drop != null) {
				player.dropEQ((Equipment) this.options.get(1).drop);
			}
			player.current = this.options.get(1).next;
			return this.options.get(1).next;
			//Option b
		} else if (input.equalsIgnoreCase("c")) {
			System.out.println(this.options.get(2).printResult());
			if (this.options.get(2).pickup != null) {
				player.pickupEQ((Equipment) this.options.get(0).pickup);
			} else if (this.options.get(2).drop != null) {
				player.dropEQ((Equipment) this.options.get(2).drop);
			}
			player.current = this.options.get(2).next;
			return this.options.get(2).next;
			//Option c
		} else if (input.equalsIgnoreCase("d")) {
			System.out.println(this.options.get(3).printResult());
			if (this.options.get(3).pickup != null) {
				player.pickupEQ((Equipment) this.options.get(3).pickup);
			} else if (this.options.get(3).drop != null) {
				player.dropEQ((Equipment) this.options.get(3).drop);
			}
			player.current = this.options.get(3).next;
			return this.options.get(3).next;
			//Option d
		} else if (input.equalsIgnoreCase("i")) {
			System.out.println(player.inventory.toString());
			// print Inventory
		}
		return null;
	}
}

