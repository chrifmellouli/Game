package sonysoft.game.models;

public class Tank extends Character {

	private String id;
	private int missile;

	public Tank() {
		super();
	}

	public Tank(String id, int missile, int power, int speed) {
		super(power, speed);
		this.id = id;
		this.missile = missile;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMissile() {
		return missile;
	}

	public void setMissile(int missile) {
		this.missile = missile;
	}

	@Override
	public void fire() {
		super.isReady();
		this.missile--;
		System.out.println("Tank with id " + this.id + " FIRE ! " + this.missile + " left");
		if (this.missile == 0) {
			this.out();
		}
	}

	@Override
	public void fireAtWill() {
		System.out.println("Tank with id  " + this.id + " FIRE AT WILL! ");
		while (this.missile > 0) {
			fire();
		}
	}

	@Override
	public void out() {
		System.out.println("Tank with id " + this.id + " is out of missiles, Sir!");
	}

	@Override
	public String toString() {
		return "Tank [id=" + id + ", missile=" + missile + ", toString()=" + super.toString() + "]";
	}

}
