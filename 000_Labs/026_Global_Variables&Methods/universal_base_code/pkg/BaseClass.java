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
	int intellegence;
	int charisma;
	
	public BaseClass() {
		role = "no role";
		strength = 0;
		dexterity = 0;
		intellegence = 0;
		charisma = 0;
	}

	public void myToString(){
		System.out.println("Your role is "+role+".");
		System.out.println("Strength: "+strength);
		System.out.println("Dexterity: "+dexterity);
		System.out.println("Intellegence: "+intellegence);
		System.out.println("Charisma: "+charisma);
	}

}

