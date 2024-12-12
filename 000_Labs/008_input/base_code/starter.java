/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats your name?");
		String name = sc.nextLine();
		System.out.println("Howdy "+name+"! How old are you?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("What month were you born in "+name+"?");
		String month = sc.nextLine();
		System.out.println(month+" is a fantastic month! What day of "+month+" were you born?");
		int day = sc.nextInt();
		System.out.println("Very cool! What year were you born?");
		int year = sc.nextInt();
		System.out.println("So, your name is "+name+" , you were born on "+month+" "+day+", "+year+", and you are "+age+" years old?" );
		System.out.println("So, "+name+", how much is a buck fifty?");
		double buckfity = sc.nextDouble();
		System.out.print("So a buck fifty is $"+buckfity+"? Nice.");
		
		
	}
}
