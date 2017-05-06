package cs30gameproject;

public class Consumable extends Item {
	
	int value = 0;
	
	/**
	 * Constructor
	 * @param name
	 * @param description
	 * @param value
	 */
	Consumable(String name, String description, int value) {
		this.name = name;
		this.description = description;
		this.value = value;
	}
	
	public String fullString() {
		return name + ": " + description + ". +" + value + " Hp";
	}
	
}
