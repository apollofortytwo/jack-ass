package cs30gameproject;
/**
 * This class stores all the data and methods for the Player
 * @author Jacky Zhou
 *
 */
public class Player {
	String name; // name of the player
	int hp, atk, def, baseAtk, baseDef; // stats for the player
	Inventory inventory = new Inventory(); // the player's inventory
	Scenario current; // the Scenario that the Player is currently in
	
	/**
	 * Constructor
	 * 
	 * @param name
	 * @param hp
	 * @param atk
	 * @param def
	 */
	Player(String name, int hp, int atk, int def) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.baseAtk = atk;
		this.def = def;
		this.baseDef = def;
	}
	
	/**
	 * Creates a Player with default settings if no parameters are added
	 */
	Player() {
		this("<Unnamed>", 10, 10, 10);
	}
	
	/**
	 * Prints the Player's name and stats
	 */
	public String toString() {
		return name + ": " + hp + " Health, " + atk + " Attack, " + def
				+ " Defense.";
	}
	
	/**
	 * Adds an item to the Player's equipment and prints out the Player's inventory and stats
	 * @param equipment (the equipment item to be added)
	 */
	public void pickupEQ(Equipment eq) {
		this.inventory.equipment.add(eq);
		this.inventory.changeAtk(this); 
		this.inventory.changeDef(this);
		System.out.println(eq.fullString());
		System.out.println(this.inventory.toString());
		System.out.println(this.toString());
	}
	
	/**
	 * Removes an item from the Player's equipment and prints out the Player's inventory and stats
	 * @param equipment (the equipment item to be removed)
	 */
	public void dropEQ(Equipment eq) {
		this.inventory.equipment.remove(eq);
		this.inventory.changeAtk(this);
		this.inventory.changeDef(this);
		System.out.println(this.inventory.toString());
		System.out.println(this.toString());
	}
	
	/**
	 * Adds an item to the Player's consumables 
	 * @param consumable (the consumable item to be added)
	 */
	public void pickupCS(Consumable consumable) {
		this.inventory.consumable.add(consumable);
	}
	
	/**
	 * Removes an item from the Player's consumables 
	 * @param consumable (the consumable item to be removed)
	 */
	public void dropCS(Consumable consumable) {
		this.inventory.consumable.add(consumable);
	}

}
