package cs30gameproject;
/**
 * this class stores all the data and methods for each Option
 * @author 499072002
 *
 */
public class Option {
	String letter, description, result;
	int value = 0;
	Item pickup, drop;
	Enemy enemy;
	Scenario next;
	
	/**
	 * Constructor
	 * @param letter(the letter associated with the option)
	 * @param description(what the option does)
	 * @param next(which Scenario it will go to after)
	 */
	Option(String letter, String description, String result) {
		this.letter = letter;
		this.description = description;
		this.result = result;
	}
	/**
	 * Prints the Option
	 */
	public String toString() {
		return letter + ": " + description;
	}
	/**
	 * prints the result of the Option
	 * @return String (the description of the result)
	 */
	public String printResult() {
		return result;
	}
	
}
