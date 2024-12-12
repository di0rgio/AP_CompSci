/*
 *	Author: Giorgio Banna
 *  Date: 11/5/24
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] a = new int[1001];
		 for (int c = 0; c<a.length; c++){
		 	a[c] = c * 3 + 3;
		 	System.out.print(a[c]+" ");
		 }
	
	System.out.println(" ");
	System.out.println(" ");
	
		int [] b = new int[1001];
		
		for (int count = 0; count < b.length; count++){
			b[count] = b.length - 1 - count;
			System.out.print(b[count]+" ");
		}
	}
}
