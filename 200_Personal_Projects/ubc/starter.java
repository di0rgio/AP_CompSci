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
		BaseClass test = new BaseClass();
	int a = 0;
	int c = 0;
	while(c<5){
		System.out.print("Please input a grade: ");
		int b = sc.nextInt();
		a = a + b;
		c = c + 1;
	}
	double answer = a/5.0;
	System.out.print("Your average grade is "+answer+".");
		
	}
}
