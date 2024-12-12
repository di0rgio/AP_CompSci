/* 
    
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name!");
        String name = sc.nextLine();
        System.out.println("Hello "+name+"!");
        System.out.print("Please enter a number:");
        int numberone = sc.nextInt();
        sc.nextLine();
        System.out.print("Please enter another number:");
        int numbertwo = sc.nextInt();
        sc.nextLine();
        System.out.println("The sum of these numbers are "+(numberone+numbertwo));
        System.out.println("whats your favorite food?");
        String food = sc.nextLine();
        System.out.print("Nice choice "+name+"! "+food+" is very tasty!");
	}
}