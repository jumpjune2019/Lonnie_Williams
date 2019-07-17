//Lonnie Williams
//Jump Training

interface LambdaFunction{
  void call(); }

public class StringArrayUtilities
{ 
	/* Returns count of occurrences of s in myList[] */
	static int search(String[]myList, String s) 
	{ 
			int counter = 0; 
			for (int j = 0; j < myList.length; j++) 

				/* checking if string given in query is 
				present in the given string. If present, 
				increase times*/
				if (s.equals(myList[j])) 
					counter++; 

		return counter; 
	} 

	static void answerQueries(String[] myList, String q[]) 
	{ 
		for (int i=0;i<q.length; i++) 
			System.out.print(search(myList, q[i]) + " "); 
	} 

	public static void main(String[] args) { 
		LambdaFunction lambdaFunction1 = () -> System.out.println("This is the a test of the arrayHasExactMatch and indexOfOccurenceInArray methods."); 
		lambdaFunction1.call();
		LambdaFunction lambdaFunction2 = () ->System.out.println("The array to test contains the following items: Bozo, FooBar, Delta, Foozball, Demo, Money, Zoo");
		lambdaFunction2.call();
		String[] myList = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money", "Zoo"};
		String[] q = {"Boz","Delta","Zoom"}; 
		LambdaFunction lambdaFunction3 = () ->System.out.print("True: ");
		answerQueries(myList, q); 
	} 
} 

