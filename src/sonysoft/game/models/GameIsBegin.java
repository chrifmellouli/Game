package sonysoft.game.models;

public class GameIsBegin {

	public static void main(String[] args) {

		Character soldierChrif = new Soldier("Takahka", 5, 100, 20);
		Character tankChrif = new Tank("T35", 4, 200, 40);
		Character fighterChrif = new Fighter("F17", 3, 400, 80);

		Character soldierSonia = new Soldier("Maroko", 5, 110, 30);
		Character tankSonia = new Tank("T70", 4, 200, 50);
		Character fighterSonia = new Fighter("F35", 3, 400, 90);

		System.out.println("Chrif WAR");
		soldierChrif.fire();
		tankChrif.fire();
		fighterChrif.fire();

		soldierChrif.fireAtWill();
		tankChrif.fireAtWill();
		fighterChrif.fireAtWill();

		System.out.println("Sonia WAR");
		soldierSonia.fire();
		tankSonia.fire();
		fighterSonia.fire();

		soldierSonia.fireAtWill();
		tankSonia.fireAtWill();
		fighterSonia.fireAtWill();

	}

}
