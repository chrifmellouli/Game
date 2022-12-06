package sonysoft.game.models;

public class Fighter extends Character {

	private String id;
	private int bomb;

	public Fighter() {
		super();
	}

	public Fighter(String id, int bomb, int power, int speed) {
		super(power, speed);
		this.id = id;
		this.bomb = bomb;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBomb() {
		return bomb;
	}

	public void setBomb(int bomb) {
		this.bomb = bomb;
	}

	@Override
	public void fire() {
		super.isReady();
		this.bomb--;
		System.out.println("Fighter with id " + this.id + " FIRE ! " + this.bomb + " left");
		if (this.bomb == 0) {
			this.out();
		}
	}

	@Override
	public void fireAtWill() {
		System.out.println("Fighter with id " + this.id + " FIRE AT WILL! ");
		while (this.bomb > 0) {
			fire();
		}
	}

	@Override
	public void out() {
		System.out.println("Fighter with id " + this.id + " is out of bombs, Sir!");
	}

	@Override
	public String toString() {
		return "Fighter [id=" + id + ", bomb=" + bomb + ", toString()=" + super.toString() + "]";
	}

}
