package cs30gameproject;

public class Enemy {
	String name, picture;
	int hp, atk, def;
	
	Enemy() {
		this("<Enemy>","<Picture>\n",10, 10, 10);
	}
	/**
	 * Constructor
	 * @param name
	 * @param pic
	 * @param hp
	 * @param atk
	 * @param def
	 */
	Enemy(String name, String pic, int hp, int atk, int def) {
		this.name = name;
		this.picture = pic;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}

	public String toString() {
		return picture + "\n" + name + ": " + hp + " Health, " + atk
				+ " Attack, " + def + " Defense. ";
	}
}
