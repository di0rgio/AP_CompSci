/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		BaseClass Bob = new BaseClass();
		
		Bob.myToString();
		
		int count=0;
		
		System.out.println("Choose a role, Wizard, Warrior, or Rogue.");
		Bob.setRole(sc.nextLine());
		
		while(count<3){
		
		System.out.println("You leveled up!");
		
		System.out.print("Add Strength points (1-10): ");
		Bob.setStrength(sc.nextInt());
		
		System.out.print("Add Dexterity points (1-10): ");
		Bob.setDexterity(sc.nextInt());
		
		System.out.print("Add Intelligence points (1-10): ");
		Bob.setIntelligence(sc.nextInt());
		
		System.out.print("Add Charisma points (1-10): ");
		Bob.setCharisma(sc.nextInt());

		
		Bob.myToString();
		count++;
		}
	}
}
