/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please provide 3 integers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		int big = 0;
		
		if(a>b && a>c){
		big = a;
		}
		
		if(b>a && b>c){
		big = b;
		}
		
		if(c>a && c>b){
		big = c;
		}
		
		System.out.println("Your largest number is: "+big);
		
		int small = 0;
		
		if(a<b && a<c){
		small = a;
		}
		
		if(b<a && b<c){
		small = b;
		}
		
		if(c<a && c<b){
		small = c;
		}
		
		System.out.print("Your smallest number is: "+small);
		
	}
}
