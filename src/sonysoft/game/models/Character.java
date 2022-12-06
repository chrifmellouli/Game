package sonysoft.game.models;

public abstract class Character implements Fighting{

	private int power;
	private int speed;

	public Character() {
		super();
	}

	public Character(int power, int speed) {
		super();
		this.power = power;
		this.speed = speed;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void isReady() {
		System.out.println("I'm ready to die in this war Sir!");
	}

	public abstract void out();

	@Override
	public String toString() {
		return " [power=" + power + ", speed=" + speed + "]";
	}

}
