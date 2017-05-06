package cs30gameproject;

public class Equipment extends Item {
	int atk ,def;
	
	
	/**
	 * Constructor
	 * 
	 * @param name
	 * @param description
	 * @param atk
	 * @param def
	 */
	Equipment(String name, String description, int atk, int def) {
		this.name = name;
		this.description = description;
		this.atk = atk;
		this.def = def;
	}
	
	/**
	 * creates a Equipment with default stats if no parameters are entered
	 */
	Equipment() {
		this("<EQ>", "EQ description", 0, 0);
	}
	
	public String toString() {
		return name; 
	}
	
	public String fullString() {
		return name + ": " + description + ". ATK " + atk + " DEF " + def;
 	}

}
