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
		System.out.print("Enter a word: ");
		String word = sc.nextLine();
		
		for(int i = 0; i < word.length(); i++){
			System.out.println(word.substring(i,i+1)+" "+i);
		}


		
	}
}
