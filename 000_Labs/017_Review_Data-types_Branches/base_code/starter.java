/*
 *	Author:  Giorgio Banna
 *  Date: Septemer 24th, 2024
 *  Collaborators: Emin G
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is your name, brave one?");
	String name = sc.nextLine();
	System.out.println(" ");
	System.out.println("Nice name "+name+", what shall your title be? Ex. Slayer of Dragons");
	String title = sc.nextLine();
	System.out.println(" ");
	System.out.println("Choose a role "+name+", Wizard, Warrior, or Rogue.");
	
	String role = sc.nextLine();
	
	if (role.equals("Wizard") ||role.equals("wizard"))
		System.out.println("You chose Wizard! How Magical of you!");
	
	else if (role.equals("Warrior") || role.equals("warrior"))
		System.out.println("You chose Warrior. How Brave of you!");

	else if (role.equals("Rogue") || role.equals("rogue"))
		System.out.println("You chose Rogue. How Sneaky of you!");
	
	else{
	System.out.print("You chose not to play the game, or you spelt Rogue as Rouge");
		//return;
	}
	
	System.out.println(" ");
	System.out.println("Alright "+name+" you have 20 points to spend on the following: Strength, Dexterity, Intelligence, and Charisma. Choose wisely");
	System.out.println(" ");
	int points=20;

	int remainder1 = 0;
	System.out.print("Strength (1-10): ");
	int strength = sc.nextInt();
	sc.nextLine();
	if(strength>10){
		System.out.print("Please choose a smaller value.");
		strength = sc.nextInt();
		sc.nextLine();
		points = (points-strength);
	}
	
	else
	points = (points-strength);
	System.out.println("You have "+points+" points remaining."); 

	System.out.println(" ");

	System.out.print("Dexterity (1-10): ");
	int dexterity = sc.nextInt();
	sc.nextLine();
	if(dexterity>10||dexterity>points){
		System.out.print("Please choose a smaller value.");
		dexterity = sc.nextInt();
		sc.nextLine();
		points = (points-dexterity);
	}
	else
	points = (points-dexterity);
	System.out.println("You have "+points+" points remaining.");

	System.out.println(" ");

	System.out.print("Intelligence (1-10): ");
	int intelligence = sc.nextInt();
	sc.nextLine();
	if(intelligence>10||intelligence>points){
		System.out.print("Please choose a smaller value.");
		intelligence = sc.nextInt();
		sc.nextLine();
		points = (points-intelligence);
	}
	else
	points = (points-intelligence);
	System.out.println("You have "+points+" points remaining.");

	System.out.println(" ");

	System.out.print("Charisma (1-10): ");
	int charisma = sc.nextInt();
	sc.nextLine();
	if(charisma>10||charisma>points){
		System.out.print("Please choose a smaller value.");
		charisma = sc.nextInt();
		sc.nextLine();
		points = (points-charisma);
	}
	
	else
	points = (points-charisma);

	System.out.println(" ");
	
	System.out.println("--------------------------------------------------");
	System.out.println("You are "+name+", the "+title+" of Cyrodiil.");
	System.out.println("You are a "+role+" and these are your stats: ");
	System.out.println("Strength - "+strength);
	System.out.println("Dexterity - "+dexterity);
	System.out.println("Intellegence - "+intelligence);
	System.out.println("Charisma - "+charisma);
	System.out.println(" ");
	
	if (points==0)
	System.out.print("You used all your points! That means you have no points for next time though. :(");
	
	else if (points!=0)
	System.out.print("You have "+points+" points remaining for next time!");
	}
}
