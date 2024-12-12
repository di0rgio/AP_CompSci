/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
	int a = (int)(Math.random()*10);
	System.out.println("Random int between 0 and 9: "+a);
	int b = (int)(Math.random()*99+1);
	System.out.println("Random int between 1 and 100: "+b);
	double c = (Math.random()*1.0) + 2.5;
	System.out.println("A random double between 2.5 and 3.5: "+c);
	double d = (Math.random()*575) + 14;
	System.out.print("A random double between 14 and 589: "+d);
	
		 
	}
}
