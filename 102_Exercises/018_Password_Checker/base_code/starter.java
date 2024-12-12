import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		
		int strong1 = 0;
		int strong2 = 0;
		int strong3 = 0;
		
		for(int pee = 0; pee < passwords.length; pee++){
		    
		    boolean flag1 = false;
		    boolean flag2 = false;
		    
		    if(passwords[pee].length() >= 8){
		        strong1++;
		        flag1 = true;
		    }
		
		    if(passwords[pee].contains("!") || passwords[pee].contains("@") || passwords[pee].contains("#") || passwords[pee].contains("$") || passwords[pee].contains("%") || passwords[pee].contains("^") || passwords[pee].contains("&") || passwords[pee].contains("*")){
		        strong2++;
		        flag2 = true;
		    }
		    
		    if(flag1 && flag2){
		        strong3++;
		    }
		    
		}

		System.out.println("The amount of passwords that pass the first test are: "+strong1);
		System.out.println("The amount of passwords that pass the second test are: "+strong2);
		System.out.println("The amount of passwords that pass both test are: "+strong3);
		
	}
}
