/*
 *	Author: Giorgio Banna
 *  Date: 9/20/24
 *	Collaborator(s): None
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("What day is it? 1=Sunday 2=Monday 3=Tuesday 4=Wednesday 5=Thursday 6=Friday 7=Saturday");
	
	int day = sc.nextInt();
	
	if(day==1||day==7)
	System.out.print("It's a weekend, you get to wake up at 10:00!");
	
	else if(day==2||day==3||day==4||day==5||day==6)
	System.out.print("BEEP BEEP BEEP!!! ITS 7:00 ON A WEEKDAY AND YOU HAVE SCHOOL!");
	
	}
}
