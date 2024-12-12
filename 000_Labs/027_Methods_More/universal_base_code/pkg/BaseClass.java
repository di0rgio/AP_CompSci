/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	
	public BaseClass() {
		role = "no role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}

	public void myToString(){
		System.out.println(" ");
		System.out.println("--------------------------------");
		System.out.println("Your role is "+role+".");
		System.out.println("Strength: "+strength);
		System.out.println("Dexterity: "+dexterity);
		System.out.println("Intellegence: "+intelligence);
		System.out.println("Charisma: "+charisma);
		System.out.println("--------------------------------");

	}
	
	// public BaseClass(String r, int s, int d, int i, int c){
	// 	role = r;
	// 	strength = s;
	// 	dexterity = d;
	// 	intelligence = i;
	// 	charisma = c;
	// } 

	public void setRole(String r){
		role = r;
		if (role.equals("Wizard") ||role.equals("wizard"))
		System.out.println("You chose Wizard! How Magical of you!");
	
	else if (role.equals("Warrior") || role.equals("warrior"))
		System.out.println("You chose Warrior. How Brave of you!");

	else if (role.equals("Rogue") || role.equals("rogue"))
		System.out.println("You chose Rogue. How Sneaky of you!");
	
	else{
	System.out.println("You chose not to play the game, or you spelt Rogue as Rouge");
	}
	}
	public void setStrength(int s){
		if(s>0){
			strength+=s;
		}
		else
		strength=0;
		}
	
	public void setDexterity(int d){
		if(d>0){
			dexterity+=d;
		}
		else
		dexterity=0;
		}
	public void setIntelligence(int i){
		if(i>0){
			intelligence+=i;
		}
		else
		intelligence=0;
		}
	public void setCharisma(int c){
		if(c>0){
			charisma+=c;
		}
		else
		charisma=0;
		}
}

