import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many special squares would you like to see: ");
		int amount = sc.nextInt();
		int test = 1;
		int squares = 0;
		
		while(squares < amount){
			int sum = test * (test + 1)/2;
			int sqrt = (int) Math.sqrt(sum);
			
			if(sqrt * sqrt == sum){
			
				System.out.println(sum+" is a special square.");
				squares++;
			}
		
			
			test++;
		}
		
		
		
	}
}
