package FLCC;
/*
Jacob Stein
2/6/23
Asks the user for number of rocks, and then outputs the number of boxes filled and the number left over
*/

import java.util.Scanner;

public class BoxOfRocks {
    public static void main(String[] args) {

        // All the dirty work happens in the 'fillBoxes()' method; let's call it here from the main method!
        fillBoxes();

    }

    // this method asks the user for the number of rocks
    // and outputs the number of boxes filled and number of rocks left over

    public static void fillBoxes() {

        // Create a new Scanner to read in input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and then store their input in 'numRocks'
        System.out.println("Enter the number of rocks:");
        System.out.println();
        int numRocks = scanner.nextInt();

        // Determine the number of boxes filled and the number of rocks left over. It takes 8 rocks to fill a box.
        // ex. if numRocks is 26, the output would be:
        // You will completely fill 3 boxes.
        // You will have 2 rocks left over.
        int x = 8;
        int box = numRocks / x;
        int remain = numRocks % x;

        System.out.println("You will completely fill " + box + " "+  "boxes.");
        System.out.println("You will have " + remain + " " + "rocks left over.");


    }

}

/*
Where did you struggle with this coding work?
I did not struggle with this work
What was easy?
Yes it was easy for me.
What questions do you still have?
None, at the moment
*/