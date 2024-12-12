/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Choose a role, Wizard, Warrior, or Rogue.");
	
	String role = sc.nextLine();
	
	if (role.equals("Wizard") ||role.equals("wizard"))
	System.out.print("You chose Wizard! How Magical of you!");
	
	else if(role.equals("Warrior") || role.equals("warrior"))
	System.out.print("You chose Warrior. How Brave of you!");

	else if(role.equals("Rogue") || role.equals("rogue"))
	System.out.print("You chose Rogue. How Sneaky of you!");
	
	else
	System.out.print("You chose not to play the game, or you spelt Rogue as Rouge");

	}
}
