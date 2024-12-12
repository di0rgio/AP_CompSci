/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are going to go on a run and you are deciding what type of run you are doing today: ");
	    System.out.println("1. Go on a long run, you are feeling good today and think you can go 10+ miles.");
	    System.out.println("2. Todays a good day for a workout, cool weather means an easy workout.");
	    System.out.println("3. You went hard yesterday, today is a recovery day.");
	   
	   int answer1 = sc.nextInt(); 
	   sc.nextLine();
	   
	    if(answer1 == 1){
	   System.out.println("Nice choice! Long runs are fantastic. Next you decide, are you going to listen to music(1) or not(2)?");
	    int answer2 = sc.nextInt();
	    sc.nextLine();
	    if(answer2 == 1)
	    System.out.print("You put on your earbuds, you grab your watch and have a fantastic long run, nice!");
	    else if(answer2 == 2)
	    System.out.print("You decide not to run with music, that's ok! You have a nice run while listening to the beautiful sounds of nature (and the freeway).");
	    }
      
      
        else if(answer1 == 2){
        System.out.println("Awesome! Now you must decide, what workout will you be doing,");
        System.out.println("1. Mile Repeats!");
        System.out.println("2. Tempo at the park!");
        int answer3 = sc.nextInt();
        sc.nextLine();
        if(answer3 == 1)
        System.out.print("You hate yourself for choosing mile repeats but you know you will benefit from it. It was not a great workout but you feel accomplished afterwards, good job!");
        else if(answer3 == 2)
        System.out.print("Tempo at the park! How fun, you go to the park and have a nice workout, you are ready for the next hilly race!");
        }
       
       
        else if(answer1 == 3){
        System.out.print("Recovery day! Nice, these are always important. Will you invite a friend(1) or not(2)?");
        int answer4 = sc.nextInt();
        sc.nextLine();
        if(answer4 == 1)
        System.out.print("You invite your friend out for a run and you have a nice easy run while talking, nice.");
        else if(answer4 == 2)
        System.out.print("You decide not to run with a friend, that all good. You have a niceand caling run while thinking to yourself.");
        }
    
        else{
            System.out.print("You decide not to run. You walk home and once you get there all you do is eat and play video games, shame on you.");
        }
        
    }
}