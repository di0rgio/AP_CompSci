/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
	int b = (int)(Math.random()*149)+51;
	int [] a = new int[b];
	
	for (int c = 0; c < a.length; c++){
		a[c] = (int)(Math.random()*100)+1;
	}

	int min = Integer.MAX_VALUE;
	
	for(int c = 0; c < a.length; c++){
		if (a[c] < min){
			min = a[c];
		}
	}
	
	int max = 0;
	
	for(int c = 0; c < a.length; c++){
		if (a[c] > max){
			max = a[c];
		}
	}
	
	int sum = 0;
	
	for(int c = 0; c < a.length; c++){
		sum += a[c];
	}
	
	sum /= a.length;
	
	System.out.println("There are "+a.length+" elements.");
	System.out.println("The smallest number is: " + min);
	System.out.println("The largest number is: " + max);
	System.out.println("The average of these numbers are: " + sum);
	
		
	}
}
