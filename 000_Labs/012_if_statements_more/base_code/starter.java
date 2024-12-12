/*
 *	Author:  Giorgio Banna
 *  Date: 9/19/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Please provide two integers: ");

	int a = sc.nextInt();
	int b = sc.nextInt();
	
	if(a==b)
	System.out.print("Why would you ever choose two of the same number...");
	
	
	else if(a!=b)
	System.out.print("Nice choice of numbers!");
	}
}
