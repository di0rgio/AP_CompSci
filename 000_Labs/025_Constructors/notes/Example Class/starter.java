import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What role would you lie to be, Rogue, Warrior, or Wizard: ");
		String role = sc.nextLine();
		if (role.equals("Wizard") ||role.equals("wizard"))
			System.out.println("You chose Wizard! How Magical of you!");
	
		else if (role.equals("Warrior") || role.equals("warrior"))
			System.out.println("You chose Warrior. How Brave of you!");

		else if (role.equals("Rogue") || role.equals("rogue"))
			System.out.println("You chose Rogue. How Sneaky of you!");
		
		myCharacter guy = new myCharacter(role);
	
		myCharacter guy2 = new myCharacter();
		
		System.out.println(guy.role+" is your role.");
	}
}
