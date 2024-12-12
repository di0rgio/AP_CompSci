/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
			Scanner sc = new Scanner(System.in);
	
	int a = (int)(Math.random()*1001+1);
	
	System.out.println("Guess the random number between 1 and 1000 that I am thinking of!");
	
	int b = sc.nextInt();
	
	if(b==a)
	System.out.println("Congrats! You guessed the right number!");
	
	else if(a<b)
	System.out.println("You guessed higher than the correct number :(");
	
	else if(a>b)
	System.out.println("You guessed lower than the correct number :(");
	
	System.out.print("The correct number was: "+a);
		 
	}
}
