//Lonnie Williams
//Jump Training


public class HeadOrTailTally {
 
  public static void main(String[] args) { 
    int heads = 0;
    int tails = 0;
 
    for(int x=0;x<1000;x++){
      if (Math.random() < 0.5) {
        tails = tails +1;
      } else {
        heads = heads +1;
      }
    }
 
    System.out.println("Count of Heads: " + heads);
    System.out.println("Count of Tails: " + tails);
  }
}