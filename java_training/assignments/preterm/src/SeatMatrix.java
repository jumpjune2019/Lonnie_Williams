import java.lang.*;
import java.util.*;
import java.io.*;

public class SeatMatrix {

    static Scanner input = new Scanner(System.in);
    static String arrS[][] = new String[10][10];
    static String cName[] = {"A","B","C","D","E","F","G","H","I","J"};

    static int i, j;            // Loop Control Variables

    static void dispData() {    // Method that will display the array content
        for (i=0; i<10; ++i) {
            for (j=0; j<10; ++j) {
                System.out.print(arrS[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean chkData(String vData) {  // Method that will check for reservation availability
        for (i=0; i<10; ++i) {
            for (j=0; j<10; ++j) {
                if ((arrS[i][j]).equalsIgnoreCase(vData)) {
                    arrS[i][j]="X";
                    return true;
                }
            }
        }
        return false;
    }

    static boolean chkFull() {  // Method that will check if all reservations were occupied
        for (i=0; i<10; ++i) {
            for (j=0; j<10; ++j) {
                if (!(arrS[i][j]).equals("X")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String eds[]) throws IOException {  // the MAIN method program
        System.out.println("Welcome to AMC Theatres!");
		
		String inData = new String("");
        for (i=0; i<10; ++i) {                                   // Initialized array with constant data
            for (j=0; j<10; ++j) {
                arrS[i][j] = new String((i+1) + cName[j]);
            }
        }

        do {                                                    // Loop until user press X to exit
            dispData();
            if (chkFull())
            {
                System.out.println("Reservation is FULL");
                inData="X";
            }
            else 
            {
                System.out.print("Please choose your seats seperated by spaces. Enter 'X' to exit. ");
                inData = input.next();
                if (chkData(inData))
                    System.out.println("Seat(s) reserved successful!");
                else
                    System.out.println("Saving your choices. Terminating program..");
            }       
        } while (!inData.equalsIgnoreCase("X"));

    }   
}