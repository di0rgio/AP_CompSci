/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf bob = new PooleDwarf(randName(),100);
		PooleDwarf john = new PooleDwarf(randName(),213);
		PooleDwarf hero = new PooleDwarf(randName(),156);
		PooleDwarf james = new PooleDwarf(randName(),123);
		PooleDwarf methuselah = new PooleDwarf(randName(),969);
		PooleDwarf timothy = new PooleDwarf(randName(),75);
		PooleDwarf mark = new PooleDwarf(randName(),452);
	
		int dupe = 0;
	
		if (bob.isSameName(john.getName()))
			dupe++;
			
		if (bob.isSameName(hero.getName()))
			dupe++;
			
		if (bob.isSameName(james.getName()))
			dupe++;		
		
		if (bob.isSameName(methuselah.getName()))
			dupe++;
		
		if (bob.isSameName(timothy.getName()))
			dupe++;
		
		if (bob.isSameName(mark.getName()))
			dupe++;
	
		System.out.print(bob.getName()+" was the name with "+dupe+" matches!");
	}
}
