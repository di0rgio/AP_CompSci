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
		System.out.print("Please enter a sentence: ");
		String sentence = sc.nextLine();
		String finalSent = " ";
		
		
		while(true){
			if(sentence.indexOf(" ") == -1){
				System.out.print(sentence + " ");
				break;
		}
		int space = sentence.indexOf(" ");
		String word = sentence.substring(0, space);
		sentence = sentence.substring(space+1);
		finalSent = word + " " + finalSent;
		}

		System.out.print(finalSent);
		
	}
}
