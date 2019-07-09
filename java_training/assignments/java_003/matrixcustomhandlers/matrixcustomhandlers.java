//Lonnie Williams
//Jump Training

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A Class that represents use-defined expception 
class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    } 
} 

public class matrixCustomerHandlers {

	public static void main(String[] args) {
		private static final Scanner scnr = new Scanner(System.in);
		private static String choice;

		public static void main(String[] args) {
		out.println("1. Print on screen only");   
		out.println("2. Print to text file");
                out.println("3. Print on both");
                choice = scnr.nextLine();

		//declare two-dimensional array
		String[][] diceLabels = new String[6][6];
		
		//fill diceLabels array
		diceLabels[0][0] = "Snake eyes";
		diceLabels[0][1] = "Ace caught a deuce";
		diceLabels[0][2] = "Easy four";
		diceLabels[0][3] = "Little Phobe";
		diceLabels[0][4] = "Sixie from Dixie";
		diceLabels[0][5] = "The Devil";
		diceLabels[1][0] = "Austrailian yo";
		diceLabels[1][1] = "Ballerina";
		diceLabels[1][2] = "OJ";
		diceLabels[1][3] = "Easy six";
		diceLabels[1][4] = "Skinny Dugan";
		diceLabels[1][5] = "Easy eight";
		diceLabels[2][0] = "Little Joe from Kokomo";
		diceLabels[2][1] = "The fever";
		diceLabels[2][2] = "Brooklyn forest";
		diceLabels[2][3] = "Skinny McKinney";
		diceLabels[2][4] = "Easy eight";
		diceLabels[2][5] = "Lou Brown";
		diceLabels[3][0] = "No field five";
		diceLabels[3][1] = "Jimmie Hicks";
		diceLabels[3][2] = "Big Red";
		diceLabels[3][3] = "Square pair";
		diceLabels[3][4] = "Jesse James";
		diceLabels[3][5] = "Tennessee";
		diceLabels[4][0] = "Easy six";
		diceLabels[4][1] = "Bennie Blue";
		diceLabels[4][2] = "Eighter from Decater";
		diceLabels[4][3] = "Railroad nine";
		diceLabels[4][4] = "Puppy paws";
		diceLabels[4][5] = "Six five no jive";
		diceLabels[5][0] = "Six one you're done";
		diceLabels[5][1] = "Easy eight";
		diceLabels[5][2] = "Nina from Pasadena";
		diceLabels[5][3] = "Big one on the road";
		diceLabels[5][4] = "Yo";
		diceLabels[5][5] = "Midnight";
		
		
		//print the header
		System.out.println("Dice Combinations Label Matrix\n");
		System.out.print("\tDie 1 \t\t\tDie 2 \t\t\tDie 3 \t\t\tDie 4 \t\t\tDie 5 \t");
		System.out.println("\t\tDie 6");
		
		//print line 1
		System.out.print("Die 1 \t" + diceLabels[0][0] + "\t\t" + diceLabels[0][1] + "\t"); 
		System.out.print(diceLabels[0][2] + "\t\t" + diceLabels[0][3] + "\t\t" + diceLabels[0][4]); 
		System.out.println("\t" + diceLabels[0][5]);
		
		//print line 2
		System.out.print("Die 2 \t" + diceLabels[1][0] + "\t\t" + diceLabels[1][1] + "\t\t"); 
		System.out.print(diceLabels[1][2] + "\t\t\t" + diceLabels[1][3] + "\t\t" + diceLabels[1][4]); 
		System.out.println("\t\t" + diceLabels[1][5]);
		
		//print line 3
		System.out.print("Die 3 \t" + diceLabels[2][0] + "\t" + diceLabels[2][1] + "\t\t"); 
		System.out.print(diceLabels[2][2] + "\t\t" + diceLabels[2][3] + "\t\t" + diceLabels[2][4]); 
		System.out.println("\t\t" + diceLabels[2][5]);
		
		//print line 4
		System.out.print("Die 4 \t" + diceLabels[3][0] + "\t\t" + diceLabels[3][1] + "\t\t"); 
		System.out.print(diceLabels[3][2] + "\t\t\t" + diceLabels[3][3] + "\t\t" + diceLabels[3][4]); 
		System.out.println("\t\t" + diceLabels[3][5]);
		
		//print line 5
		System.out.print("Die 5 \t" + diceLabels[4][0] + "\t\t" + diceLabels[4][1] + "\t\t"); 
		System.out.print(diceLabels[4][2] + "\t" + diceLabels[4][3] + "\t\t" + diceLabels[4][4]); 
		System.out.println("\t\t" + diceLabels[4][5]);
		
		//print line 6
		System.out.print("Die 6 \t" + diceLabels[5][0] + "\t" + diceLabels[5][1] + "\t\t"); 
		System.out.print(diceLabels[5][2] + "\t" + diceLabels[5][3] + "\t" + diceLabels[5][4]); 
		System.out.println("\t\t\t" + diceLabels[5][5]);
		
		try
        	{ 
            	// Throw an object of user defined exception 
            	throw new MyException("1" || "2" || "3"); 
        	} 
        	catch (MyException ex) 
        	{ 
           	 System.out.println("Caught"); 
  		// Print the message from MyException object 
            	System.out.println(ex.getMessage()); 
        	} 
    	} 
	}

}
