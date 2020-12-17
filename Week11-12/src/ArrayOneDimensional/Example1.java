package ArrayOneDimensional;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Welcome to our zombie killer program.");
		System.out.println("Please get ready both physically and mentally to face the zombies. ");
		System.out.println();
		
		String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};
		String zombies[] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};
		int zombiesHate[] = new int[1];
		zombiesHate [0] =  1;
		
		int NumberofZombies[] = {4, 90, 70, 123, 12, 4, 561, 1};
	
		System.out.println("Backpack item(s): ");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]);
		System.out.println();
		System.out.println(zombiesHate[0]);
		
		System.out.println("Alert! Zombies ahead! ");
		System.out.println("Type of zombies ahead: " + NumberofZombies[4] + " " + zombies[1]);

	}

}
