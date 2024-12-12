/*
 *	Author: Giorgio Banna 
 *  Date: 9/11/24
 *  Collaborators: Emin Gharibian
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please provide two numbers!");
	double x = sc.nextDouble();
	double y = sc.nextDouble();
	System.out.print("Thanks! Here is the max of the two numbers: ");
	double max = Math.max(x,y);
	System.out.println(max);
	System.out.println("This is the square root of your second number: "+Math.sqrt(y));
	System.out.println("This is your first number to the power of your second number: "+Math.pow(x,y));

	}
}
