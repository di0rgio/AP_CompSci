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
		System.out.print("Insert a first and last name with a space in the middle: ");
		String name = sc.nextLine();
		
		System.out.print("The last name is: "+name.substring(name.indexOf(" ")+1));


		
	}
}
