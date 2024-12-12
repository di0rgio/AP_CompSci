/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Slot Machine Rules: \n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.\na. If two numbers match, you double your money.\nb. If three numbers match, you triple your money.\nc. If none match, you lose your money.\n--------------------------------------------------");

	int money = 100;

	while(money!=0||money>0){
		System.out.println(" ");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) or (No/no/N/n) :");
		String yes = sc.nextLine();
			int one = (int)(Math.random()*10)+1;
			int two = (int)(Math.random()*10)+1;
			int three = (int)(Math.random()*10)+1;
			int bet = 0;		
		
		if(yes.equals("No")||yes.equals("no")||yes.equals("n")||yes.equals("N")){
			System.out.println("Sorry to see you go. You still have $"+money+". Come again soon! ");
			break;
		}
		
		else if(yes.equals("yes")||yes.equals("Yes")||yes.equals("y")||yes.equals("Y")){
			
			System.out.print("You have $"+money+", how much would you like to bet? ");
			bet = sc.nextInt();
			sc.nextLine();
			if(bet>money){
				System.out.print("You only have $"+money+"! Please input another value: ");
				bet = sc.nextInt();
				sc.nextLine();
			}
			
			if(bet<=0){
				System.out.print("Nice try, but no negatives! Please input another value: ");
				bet = sc.nextInt();
				sc.nextLine();
			}
			
			System.out.println("---------------------");
			System.out.println("| "+one+" | "+two+" | "+three+" |");
			System.out.println("---------------------");
			
			
			if(one==two && two==three && one==three){
				System.out.println("Congrats, you trippled your money!");
				money = money + bet*2;
				System.out.println("You now have $"+money);
			}
			else if(one==two||two==three||three==one){
				System.out.println("Congrats, you doubled your money!");
				money = money + bet;
				System.out.println("You now have $"+money);
			}
			else{
				System.out.println("Sorry, you did not win. Better luck next time!");
				money = money - bet;
				System.out.println("You now have $"+money);
				}
			}
			else{
				System.out.println("Please input one of the options given.");
			}
			if(money==0||money<0){
				System.out.print("You've run out of money! Thanks for coming! Come back soon!");
				break;
		}
	}




	}
}