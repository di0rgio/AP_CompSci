/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {

	public static int pow(int x, int y){
		int count = 0;
		int z = x;
		while(count < y-1){
			x = x * z;
			count = count + 1;
		}
		int num = x;
		return num;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int x = sc.nextInt();
		System.out.print("Please eneter another number: ");
		int y = sc.nextInt();
		int num = pow(x, y);
		System.out.print("This is your first value to the power of your second value using methods: "+num);
	}

	
	
	
}
