/*
 *	Author: Giorgio Banna
 *  Date: September 16, 2024
 *	Collaborator(s): Emin G, Wyatt R.
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Please provide 2 integers,");
	System.out.print("Provide your first integer: ");
	int num1 = sc.nextInt();
	sc.nextLine();
	System.out.print("Please provide another integer (larger than the last): ");
	int num2 = sc.nextInt();
	sc.nextLine();
	System.out.println("Your range is "+num1+" to "+num2+".");
	int range = (int)(Math.random()*(num2-num1)+num1);
	int range1 = (int)(Math.random()*(num2-num1)+num1);
	int range2 = (int)(Math.random()*(num2-num1)+num1);
	int range3 = (int)(Math.random()*(num2-num1)+num1);
	int range4 = (int)(Math.random()*(num2-num1)+num1);
	System.out.print("Here are 5 numbers within your range: ");
	System.out.print(range+" "+range1+" "+range2+" "+range3+" "+range4);
	

	}
}
