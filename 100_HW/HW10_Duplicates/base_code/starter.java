/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		int [] a = new int [20];
	
		System.out.println("----------------------------------------------------");
		System.out.println("These are the 20 numbers:");
		
		for (int c = 0; c < a.length; c++){
			a[c] = (int)(Math.random()*10)+1;
			System.out.print(a[c]+" ");
		}
		
		System.out.println(" ");
		System.out.println("----------------------------------------------------");
		
		int target = a[(int)(Math.random()*10)+1];
		System.out.println("The random number to be looking for is: "+target);
		
		int dupe = 0;
		
		for (int c = 0; c < a.length; c++){
			if (target == a[c]){
				System.out.println("Duplicate found at index "+c);
				dupe++;
			}
		}
	
		System.out.println("The number of duplicates of "+target+" is "+dupe+".");
		System.out.println("----------------------------------------------------");
		System.out.println("Looking for two in a row: ");
		
		for (int c = 0; c < a.length-1; c++){
			if(a[c]==a[c+1]){
				System.out.println("Two in a row found at indexes " + c + " and " + (c+1) + ". The number is " + a[c] + ".");
			}
		}
		
	}
}
