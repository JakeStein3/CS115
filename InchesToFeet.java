package FLCC;/*
Jacob Stein
2/6/23
To ask thr user for inches and outputs tp feet and inches
*/

import java.util.Scanner;

public class InchesToFeet {
    public static void main(String[] args) {

        // All the dirty work happens in the 'convert()' method; let's call it here from the main method!
        convert();

    }

    // this method asks the user for total inches and outputs the conversion to feet and inches
    public static void convert() {

        // Create a new Scanner to read in input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and then store their input in 'totalInches'
        System.out.println("Enter the number of inches:");
        System.out.println();
        int totalInches = scanner.nextInt();

        // Convert to feet and inches.
        // ex. if totalInches is 38, the output would be: 38 inches is 3 feet, and 2 inches
        int x = 12;
        int totalFeet = totalInches/x;
        int remain = totalInches % x;
        System.out.println( totalInches + " inches is "  + totalFeet + " feet," + " and" + " " + remain + " "+ "inches" );

        scanner.close();

    }

}

/*
Where did you struggle with this coding work?
I did not struggle with this work.
What was easy?
Yes it was easy for me.
What questions do you still have?
None at the moment
*/