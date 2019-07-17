import java.util.*;

class basicSorting {
 
interface LambdaFunction{
	void call();}

  public static void main(String[] args) {

    Integer[] numArr = { 10, 3, 4, 15, 7, 9, 1, 21 };
    LambdaFunction lambdaFunction1 = () ->System.out.printf("Initial Order : %s", Arrays.toString(numArr));
	lambdaFunction1.call();
    System.out.println(" ");
    System.out.println(" ");
	
    // Sorts in ascending order
    Arrays.sort(numArr); 
    LambdaFunction lambdaFunction2 = () ->System.out.printf("Ascending Order : %s", Arrays.toString(numArr));
	lambdaFunction2.call();
    System.out.println(" ");
    System.out.println(" ");
	
    // Sorts in descending order 
    Arrays.sort(numArr, Collections.reverseOrder()); 
   System.out.printf("Descending Order : %s",Arrays.toString(numArr));
    System.out.println(" ");
    System.out.println(" ");
		
    // String Array
    String[] stringArr = new String[] {"claude", "Phil", "lois", "clark", "Arthur", "Mera", "bruce"};
    System.out.println("Initial Order: ");
    System.out.println(Arrays.toString(stringArr));
    System.out.println(" ");
	
    // Sorting String Array
    Arrays.sort(stringArr);
    System.out.println("Ascending Order with Cases On: ");
    System.out.println(Arrays.toString(stringArr));
    System.out.println(" ");
	
    Arrays.sort(stringArr, String.CASE_INSENSITIVE_ORDER);
    System.out.println("Ascending Order with Cases Off: ");
    System.out.println(Arrays.toString(stringArr));
    System.out.println(" ");
	
    Arrays.sort(stringArr, Collections.reverseOrder());
    System.out.println("Descending Order with Cases On: ");
    System.out.println(Arrays.toString(stringArr));
    System.out.println(" ");
	
    Arrays.sort(stringArr, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
    System.out.println("Descending Orders with Cases Off: ");
    System.out.println(Arrays.toString(stringArr));
    System.out.println(" ");  
}}