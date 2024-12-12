/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Please provide two integers: ");
	int a = nextInt();
	int b = nextInt();
	
	if(a==b)
	System.out.print("Wow! Why would you choose two of the same numbers!");
	
	
	else if(a!=b)
	System.out.print("Nice choice of numbers!");
	
	}
}
