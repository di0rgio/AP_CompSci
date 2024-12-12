/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Characters{
	String role;
	int strength;
	int dext;
	int intel;
	int constit;
	int rizz;


	public Characters(){
		role = "Rogue";
		strength = 5;
		dext = 7;
		intel = 10;
		rizz = 10;
	}

	public void printAll(){
		System.out.println("Your role is "+role+".");
		System.out.println("Your strength trait is "+strength+".");
		System.out.println("Your dexterity trait is"+dext+".");
		System.out.println("Your intelligence trait is "+intel+".");
		System.out.println("Your charisma trait is "+rizz+".");
	}


}