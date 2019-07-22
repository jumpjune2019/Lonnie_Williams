//Lonnie Williams
//Jump Training

import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

interface LambdaFunction {
    void call();
}


public class GameOfDice {

    private static final Random randGen = new Random();
    private static final Scanner scnr = new Scanner(System.in);
    private static String playerName;

    public static void main(String[] args) {

		//Opening prompts
        LambdaFunction lambdaFunction1 = () -> out.println("Welcome to the dice throw challenge, punk!");
		lambdaFunction1.call();
		
        out.println(" ");
        int roundsToPlay = 1;
    
        

        int roundsWonPlayer = 0, roundsWonComp = 0;
        for (int roundsPlayed = 0; roundsPlayed < roundsToPlay &&
                roundsWonPlayer <= roundsToPlay / 2 &&
                roundsWonComp <= roundsToPlay / 2; roundsPlayed++) {

            out.println("Let's play");
            out.println("-------------------");

            boolean youFirst = (roundsPlayed & 1) == 1;
            out.format("In round %d, %s will go first.%n", roundsPlayed + 1, getRoundName(youFirst));

            int score1 = doTurn(youFirst),
                    score2 = doTurn(!youFirst),
                    playerScore = youFirst ? score1 : score2,
                    compScore = youFirst ? score2 : score1;

            boolean playerWins;
            if (playerScore <= 24 && compScore <= 24) {
                playerWins = playerScore > compScore;
            } else if (playerScore > 24 && compScore <= 24) {
                playerWins = false;
            } else if (playerScore <= 24 && compScore > 24) {
                playerWins = true;
            } else {
                playerWins = playerScore < compScore;
            }

            out.format("%s wins this round.%n", playerWins ? playerName : "Computer");
            if (playerWins) {
                roundsWonPlayer++;
            } else {
                roundsWonComp++;
            }

            out.format("TOTAL ROUNDS WON:%n"
                    + "%s: %d%n"
                    + "Computer: %d%n%n",
                    playerName, roundsWonPlayer, roundsWonComp);
        }

        if (roundsWonPlayer > roundsWonComp) {
            LambdaFunction lambdaFunction3 = () -> out.format("%s WINS THE TOURNAMENT!!!%n", playerName.toUpperCase());
			lambdaFunction3.call();
        } else if (roundsWonPlayer < roundsWonComp) {
            LambdaFunction lambdaFunction4 = () -> out.println("COMPUTER WINS THE TOURNAMENT!!!");
			lambdaFunction4.call();
        } else {
            LambdaFunction lambdaFunction5 = () -> out.println("IT IS A TIE!!!");
			lambdaFunction5.call();
        }
    }
	
	//Alternates play between user & computer
    private static int doTurn(boolean yourTurn) {
        String roundName = getRoundName(yourTurn);
        int[] rolls = getRolls();

        out.format("Dice rolls for %s: ", roundName);
        for (int i = 0; i < rolls.length - 1; i++) {
            out.format("%d, ", rolls[i]);
        }
        out.format("and %d.%n", rolls[rolls.length - 1]);

        int sum = getRollScore(rolls);
        out.format("Score for %s: %d%n", roundName, sum);

        for (int hitCounter = 0; hitCounter < 3; hitCounter++) {
            if (yourTurn && sum >= 24 || !yourTurn && sum >= 21) {
                break;
            }
            boolean rollOne;
            if (yourTurn) {
                out.println("Do you want to hit or stay?");
                if (!scnr.nextLine().equalsIgnoreCase("hit")) {
                    break;
                }
                out.println("Do you want to roll one (1) or two (2) dice?");
                rollOne = scnr.nextInt() == 1;
                scnr.nextLine();  //consumes the newline character to make way for scnr.nextLine()                  
            } else {
                rollOne = sum >= 15;
            }

            int roll4 = newRoll();
            sum += roll4;            //one additional roll
            if (rollOne) {
                out.format("%s rolls one more die. It is %d.%n", roundName, roll4);
            } else {
                int roll5 = newRoll();
                sum += roll5;
                out.format("%s rolls two more dice. They are %d and %d.%n", roundName, roll4, roll5);
            }
            out.format("%s's total score is %d.%n", roundName, sum);
        } 
        out.println();

        return sum;
    }

    private static String getRoundName(boolean yourTurn) {
        return yourTurn ? playerName : "computer";
    }
    
	//Gets the current score.
    private static int getRollScore(int[] roll) {
        if (roll[0] == roll[1] && roll[0] == roll[2]) {
            return 24;
        }
        return roll[0] + roll[1] + roll[2];
    }

    private static int newRoll() {
        return randGen.nextInt(6) + 1;
    }

    private static int[] getRolls() {
        return new int[]{newRoll(), newRoll(), newRoll()};
    }
}