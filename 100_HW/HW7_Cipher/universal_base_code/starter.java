/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have a key?(yes/y/Y/Yes)");
		String yes = sc.nextLine();
		
		
		if(yes.equals("yes")||yes.equals("Yes")||yes.equals("y")||yes.equals("Y")){
			System.out.println("Please input whatever you would like to decode and your key: ");
			String decoded = Cipher.keyedEncode(sc.nextLine(), sc.nextInt());
			System.out.print("\nYour code deciphered is \n"+decoded);
		}
	
		else{
			System.out.println("Please input whatever you would like to decode: ");
			String decoded = sc.nextLine();
			System.out.println("Here is your code through 36 different keys:");
			for(int c = 0; c<=36; c++){
				System.out.println(Cipher.keyedEncode(decoded, c));
				System.out.println("The key is: "+c);
			}
		}
			
	}
}
