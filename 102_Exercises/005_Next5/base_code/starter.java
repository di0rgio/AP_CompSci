/*
 *	Author:Giorgio Banna
 *  Date:9/11/24
 *	Collaborator(s): Emin
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a number: ");
	int num = sc.nextInt();
	double num2 = num;
	System.out.print("Here are the next 5 numbers: ");
	System.out.print(num+1+", ");
	System.out.print(num+2+", ");
	System.out.print(num+3+", ");
	System.out.print(num+4+", ");
	System.out.println(num+5);
	System.out.print("Here the next 5 multiples of "+num+": ");
	System.out.print(num*1+", ");
	System.out.print(num*2+", ");
	System.out.print(num*3+", ");
	System.out.print(num*4+", ");
	System.out.println(num*5);
	System.out.print("Here is "+num+" divided by 100: ");
	System.out.println(100.0/num2);
	System.out.print("Here is "+num+" divided by 10: ");
	System.out.print(10.0/num2);
	
	}
}
