/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {

	public static void printPrimes(int a){
		int cont = 0;
		while(cont < a){
			cont++;
			if (checkPrimes(cont)==true)
			System.out.println(cont);
		}
	}
	
	public static boolean checkPrimes(int a){
	int i = 2;
	while(i<a){
		if (a % i == 0){
			return false;
		}
		i++;
	}
	return true;
		// for(int i = 2; i<a; i++){
		// 	if(a % i == 0){
		// 		return false;
		// 	}
		// }
		// return true;
	}

	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Please input a number and I will tell you all prime numbers up to your given number: ");
		int a = sc.nextInt();
		printPrimes(a);
	}
	
}
