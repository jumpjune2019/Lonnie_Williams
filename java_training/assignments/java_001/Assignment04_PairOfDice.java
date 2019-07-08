//Lonnie Williams
//Jump Training

import java.util.Random;
import java.util.Scanner;
 
public class SimpleDie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDie dice = new SimpleDie();
      
        while (true) {
            //Allows the user to input choices.
			System.out.println("Press any key to throw a die OR type Q & Enter to quit.");
            String input = scanner.nextLine();
            
            //Quits the game.
			if (input.equalsIgnoreCase("Q")) {
                System.out.println("Bye!");
                scanner.close();
                return;	}
			
           //Print out the result. 
			if (input.equalsIgnoreCase("Q") || input.equalsIgnoreCase("Q")) {
                System.out.println("Bye!");
                scanner.close();
                return;  }
            
            else{
                int X = dice.roll1();
		    	int Y = dice.roll2();
                System.out.println("First Die: " + X);
			    System.out.println("Second Die: " + Y);
			    System.out.println(" ");  }
        }
    }
 
    // Roll the dice in Java
    private int roll1() {
        Random r1 = new Random();
        return r1.nextInt(6) + 1; }
	
	  private int roll2() {
        Random r2 = new Random();
        return r2.nextInt(6) + 1; }
}