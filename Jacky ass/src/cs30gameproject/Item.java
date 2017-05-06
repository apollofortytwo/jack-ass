package cs30gameproject;
/**
 * this class stores all the data and methods for the Item
 * @author 499072002
 *
 */
public class Item {
	String name,description;

	/**
	 * Constructor
	 * @param name
	 * @param description
	 */
	Item(String name, String description) {
		this.name = name;
		this.description = description;
	}
	/**
	 * creates a default Item if no parameters are added
	 */
	Item() {
		this("<Item>","Description");
	}

}
