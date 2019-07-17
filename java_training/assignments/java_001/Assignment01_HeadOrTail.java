//Lonnie Williams
//Jump Training 

public class HeadOrTail {

    public static void main(String[] args) { 
		System.out.println("Welcome to the game of Head or Tail where you will flip your life away!");
		System.out.println(" ");
		
        // Math.random() returns a value between 0.0 and 1.0
        // so it is heads or tails 50% of the time
        if (Math.random() < 0.5) System.out.println("Heads");
        else                     System.out.println("Tails");
    }
}