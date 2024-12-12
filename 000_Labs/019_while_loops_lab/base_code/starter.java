/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Howdy! What is your name: ");
	String name = sc.nextLine();
	System.out.print("Howdy "+name+"! Please input the number of times you would like your name to be printed: ");
	int nm = sc.nextInt();
	sc.nextLine();
	System.out.println(" ");
	
	int min = 0;
	
	while(min<nm){
		System.out.println(name);
		
		min = min + 1;
	}


		
	}
}
