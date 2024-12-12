/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
	int [] r = new int[1000];
	
	int c = 0;
	
	while (c < r.length){
		r[c] = (int)(Math.random()*1000)+1;
		System.out.print(r[c]+" ");
		c++;
	}

		
	}
}
