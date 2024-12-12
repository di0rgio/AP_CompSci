/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {

	Spiderman test = new Spiderman();
	test.setActor("Tobey Maguire");
	test.setAge(49);
	test.setVillain("Green Goblin");
	
	Spiderman two = new Spiderman("Andrew Garfield");
	two.setAge(41);
	two.setVillain("Electro");
		
	Spiderman ham = new Spiderman("John Mulany", 42);
	ham.setVillain("Duktor Doom");
	
	System.out.println("The villain is "+ham.getVillain());
		
	ham.fight();
	ham.printArt();
	
	}
}
