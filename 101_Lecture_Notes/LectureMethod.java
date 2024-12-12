/* 
    Lecture note example - Methods
*/

import java.util.Scanner;
class LectureMethod{

    public static void printAnimal(){
        System.out.println("    |\\__/,|   (`\\");
        System.out.println("  _.|o o  |_   ) )");
        System.out.println("-(((---(((--------");
        System.out.println(" ");
        return;
    }

    public static void greeting(String name){
        System.out.println("Hi there "+name);
    }

    public static double raise(double salary, int percent){
        double amount = salary +(salary*(percent/100.0));
        return amount;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        printAnimal();
        greeting("Jimothy II");
        System.out.print("Please input your salary and your raise(%): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double num = raise(a, b);
        num = raise(num, 5);

        System.out.println(num);
	}
}