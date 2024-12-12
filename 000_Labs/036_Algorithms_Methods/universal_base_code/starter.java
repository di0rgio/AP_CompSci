/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[100];
		for (int i = 0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*99)+1;
		}
	toStringArray(arr);
	System.out.println("------------------------------------------------");
	System.out.println("The average of 100 numbers is: "+getArrayAverage(arr));
	System.out.println("------------------------------------------------");
	System.out.println("The maximum of 100 numbers is: "+getArrayMax(arr));
	System.out.println("------------------------------------------------");
	System.out.println("The minimum of 100 numbers is: "+getArrayMin(arr));
	System.out.println("------------------------------------------------");

	}

	public static void toStringArray(int [] a){
		for (int i = 0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	public static int getArrayAverage(int [] b){
		int total = 0;
		for (int i = 0; i<b.length-1; i++){
			total += b[i];
		}
	
		int avg = total/b.length;
		return avg;
	}
	
	public static int getArrayMax(int [] c){
		int min = Integer.MAX_VALUE;
	
		for(int i = 0; i < c.length; i++){
			if (c[i] < min){
				min = c[i];
			}
		}
		return min;	
	}

	public static int getArrayMin(int [] d){
		int max = 0;
	
		for(int i = 0; i < d.length; i++){
			if (d[i] > max){
				max = d[i];
			}
		}
	
		return max;
	}
	
}