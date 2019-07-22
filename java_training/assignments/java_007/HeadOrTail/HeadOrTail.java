//Lonnie Williams
//Jump Training 

import java.util.Random;
import java.util.Scanner;
 
// Coin toss/flip game in Java
public class HeadOrTail {
 
    private enum Coin {
        Head, Tail
    };
 
	interface LambdaFunction{
	void call();}
	
    public static void main(String[] args) {
        HeadOrTail game = new HeadOrTail();
        game.startGame();
    }
	
	
    // Starts a coin flip game till user decides to quit.
    private void startGame() {
		LambdaFunction lambdaFunction1 = () -> System.out.println("Welcome to the game of Head or Tail where you will flip your life away!");
		System.out.println(" ");
		
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
            System.out.print("Enter your guess (f to flip, q to quit):");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("q")) {
                break;
            } else if (choice.equalsIgnoreCase("f")) {
                if (Math.random()<0.5){
				System.out.println("The flip is Heads!");}
				else { System.out.println("The flip is Tails!");}
            } else {
                System.out.println("Wrong choice! Try again!");
                continue;
            }
        }
        scanner.close();
    }
 
    // Flip a coin and return result
    private Coin tossCoin() {
        Random r = new Random();
        int i = r.nextInt(2);
        if (i == 0) {
            return Coin.Head;
        } else {
            return Coin.Tail;
        }
    }
   }