import java.util.ArrayList;

public class DicePairStats
{
    public static void main(String[] args) 
    {
        Dice dice = new Dice();
        int MAX_ROLL_COUNT = 1000; // Number of rolls
        
        ArrayList<Integer> results = new ArrayList<>(MAX_ROLL_COUNT);

        for(int i = 0; i < MAX_ROLL_COUNT; i++)
        {
            dice.roll();
            results.add(dice.getDice());
        }
        
        // show the result
        showResult(results);

    }
   static void showResult(ArrayList<Integer> res) 
   {
        int One1=0, One2=0, One3=0, One4=0, One5=0, One6=0, Two2=-0, Two3=0, Two4=0, Two5=0, Two6=0, Three3=0, Three4=0, Three5=0, Three6=0, Four4=0, Four5=0, Four6=0, Five5=0, Five6=0, Six6=0;

        for (int result : res) 
        {
            {
                if (d1=1||d2=1){
                    One1++;}
                else if(d1=1||d2=2){
                    One2++;}
                else if(d1=1||d2=3){
                    One3++;}
                else if(d1=1||d2=4){
                    One4++;}
                else if{d1=1||d2=5){
                    One5++;}
                else if(d1=1||d2=6){
                    One6++;}
                else if(d2=1||d2=2){
                    Two2++;}
                else if(d2=2||d2=3){
				    Two3++;}
                else if(d2=2||d2=4){
				     Two4++;}
                else if(d1=2||d2=5){
				    Two5++;}
                else if(d1=2||d2=6){
				    Two6++;}
                else if(d1=3||d2=3){
				    Three3++;}
                else if(d1=3||d2=4){
				    Three4++;}
                else if(d1=3||d2=5){
				    Three5++;}
                else if(d1=3||d2=6){
				    Three6++;}
                else if(d1=4||d2=4){
				    Four4++;}
                else if(d1=4||d2=5){
					Four5++;}
                else if(d1=4||d2=6){
					Four6++;}
                else if(d1=5||d2=5){
				    Five5++;}
                else if(d1=5||d2=6){
				    Five6++;}
                else if(d1=6||d2=6){
				    Six6++;}
            }
        }}
        
        System.out.print("");
    }
}
}

class Dice 
{
    int d1;
    int d2;

    void roll() 
    {
        d1 = (int)(Math.random()*6) + 1;
        d2 = (int)(Math.random()*6) + 1;
    }
    
    int getDice() 
    {
        return d1;
        return d2;
    }
}