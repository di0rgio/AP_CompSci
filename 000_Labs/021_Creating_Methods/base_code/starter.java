/*
 *	Author:Giorgio Banna
 *  Date: 10/4/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write a sentence!");
		String one = sc.nextLine();
		System.out.println("Please input another sentence!");
		String two = sc.nextLine();
		System.out.println(" ");
		combo(one, two);
	}

	public static void combo(String one, String two){
		System.out.println("This is using methods!");
		System.out.println(one);
		System.out.print(one +" "+two);
	}
	
}
