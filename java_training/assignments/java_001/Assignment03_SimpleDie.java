//Lonnie Williams
//Jump Training

import java.util.Random;
import java.util.Scanner;
 
public class SimpleDie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DiceRollerInJava dice = new DiceRollerInJava();
      
        while (true) {
            //Allows the user to input choices.
			System.out.println("Press any key to throw a die OR type Q & Enter to quit.");
            String input = scanner.nextLine();
            
            //Quits the game.
			if (input.equalsIgnoreCase("Q")) {
                System.out.println("Bye!");
                scanner.close();
                return;
			}
			
			//Print out the result. 
            int result = dice.roll();
            System.out.println("You rolled a " + result);
            
			if (input.equalsIgnoreCase("Q")) {
                System.out.println("Bye!");
                scanner.close();
                return;
            }
        }
    }
 
    // Roll the dice in Java
    private int roll() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }
}