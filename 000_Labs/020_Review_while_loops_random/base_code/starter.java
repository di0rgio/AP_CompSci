/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {	
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	int random = (int)(Math.random()*999)+1;

	System.out.println("Guess a number 1-1000!");
	int guess = sc.nextInt();
	
	while(true){
	
	
		if(random==guess){
			System.out.print("Congrats, you guessed right!");
			break;
		}
		if(guess>random){
			System.out.print("Sorry, thats incorrect. Guess smaller: ");
			guess = sc.nextInt();
			System.out.println(" ");
		}
		else if(guess<random){
			System.out.print("Sorry, thats incorrect. Guess larger: ");
			guess = sc.nextInt();
			System.out.println(" ");
		}
	}
		
	}
}
