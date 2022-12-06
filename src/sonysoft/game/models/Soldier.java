package sonysoft.game.models;

public class Soldier extends Character {

	private String name;
	private int minution;

	public Soldier() {
		super();
	}

	public Soldier(String name, int minution, int power, int speed) {
		super(power, speed);
		this.name = name;
		this.minution = minution;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinution() {
		return minution;
	}

	public void setMinution(int minution) {
		this.minution = minution;
	}

	@Override
	public void fire() {
		super.isReady();
		this.minution--;
		System.out.println("Soldier " + this.name + " FIRE ! " + this.minution + " left");
		if (this.minution == 0) {
			this.out();
		}
	}

	@Override
	public void fireAtWill() {
		System.out.println("Soldier " + this.name + " FIRE AT WILL! ");
		while (this.minution > 0) {
			fire();
		}
	}

	@Override
	public void out() {
		System.out.println("Soldier " + this.name + " is out of minutions, Sir!");
	}

	@Override
	public String toString() {
		return "Soldier [name=" + name + ", minution=" + minution + "," + super.toString() + "]";
	}

}
