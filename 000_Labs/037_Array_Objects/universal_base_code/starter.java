/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {

	Warrior [] warriors = new Warrior [100];
	Wizard [] wizards = new Wizard [100];
	
	for (int i = 0; i < warriors.length; i++) {
	    warriors[i] = new Warrior();
	}
	for (int i = 0; i < wizards.length; i++) {
	    wizards[i] = new Wizard();
	}


	int cwi = 0;
	int cwa = 0;
	
	while (cwa < warriors.length && cwi < wizards.length) {
	    warriors[cwa].attack(wizards[cwi]);
	    wizards[cwi].attack(warriors[cwa]);
	    
	    if (wizards[cwi].isDead()) {
	        cwi++;
	    }
	    
	    if (warriors[cwa].isDead()) {
	        cwa++;
	    }
	}

	if(cwa < cwi){
		System.out.println("Warriors won with "+(warriors.length-cwa-1)+" left in their army.");
	}

	if(cwi < cwa){
		System.out.println("Wizards won with "+(wizards.length-cwi-1)+" left in their army.");
	}

	}
}
