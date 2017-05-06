package cs30gameproject;

import java.util.ArrayList;

/**
 * this class stores all the Items that a player 
 * @author 499072002
 *
 */
public class Inventory {
	
	ArrayList<Equipment> equipment = new ArrayList<Equipment>();
	ArrayList<Consumable> consumable = new ArrayList<Consumable>();
	
	public String toString() {
		return "Inventory:\nWeapons/Armor: " + equipment.toString() + "\nConsumables: " + consumable.toString() + "\n";
	}
	/**
	 * Changes the attack of the Player if an item is added or removed
	 * @param player (the player that you want to change)
	 * @return the sum of all the Item's atk values plus the Player's base atk value
	 */
	public int changeAtk(Player player) {
		if(player.inventory.equipment.size() == 0) {
			player.atk = player.baseAtk;
		}
		int invAtk = 0;
		for (int i = 0; i < player.inventory.equipment.size(); i++) {
			invAtk += player.inventory.equipment.get(i).atk;
		}
		player.atk = player.baseAtk + invAtk;
		return player.atk;
	}
	/**
	 * Changes the defense of the Player if an item is added or removed
	 * @param player (the player that you want to change)
	 * @return the sum of all the Item's def values plus the Player's base def value
	 */
	public int changeDef(Player player) {
		if(player.inventory.equipment.size() == 0) {
			player.def = player.baseDef;
		}
		int invDef = 0;
		for (int i = 0; i < player.inventory.equipment.size(); i++) {
			invDef += player.inventory.equipment.get(i).def;
		}
		player.def = player.baseDef + invDef;
		return player.def;
	}
	
}
