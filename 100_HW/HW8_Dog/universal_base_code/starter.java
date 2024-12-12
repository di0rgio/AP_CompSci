/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dog name? ");
		String n = sc.nextLine();
		System.out.print("Dog age? ");
		int a = sc.nextInt();
		boolean barked=false;	

		
		Dog doggo = new Dog(n, a);
		Dog doggo2 = new Dog("Bartholomew","husky");
		
		System.out.println("\n" + doggo.getName() + " is a " + doggo.getBreed() + " who is " + doggo.getAge() + " years old");
		System.out.println("\n" + doggo2.getName() + " is a " + doggo2.getBreed() + " who is " + doggo2.getAge() + " years old");
		
		if(doggo.isSleeping()){
			System.out.println(doggo.getName()+ "is asleep.");
		}
	
		else{
			doggo.bark();
			barked = true;		
		}
	
		if(doggo2.isSleeping() && barked){
			doggo2.bark();
		}

		else if(!doggo2.isSleeping() && barked){
			doggo2.bark();
		}
	
	}
}
