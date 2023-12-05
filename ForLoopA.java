package FLCC;

import java.util.Scanner;

/*
Jacob Stein
4/17/2023
To use a for loop to count based on user input
 */
public class ForLoopA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loopA(scanner);   // Gets input and counts up by one until location entered
    }
    static void loopA(Scanner scanner){
        // Ask user for input and gets a start location and end location and will count up by 1

        System.out.println("Enter a number to start at:");
        int startAt = scanner.nextInt();

        System.out.println("Enter a number to stop at:");
        int endAt = scanner.nextInt();
        System.out.println();

        for(int i = startAt; i<=endAt; i++){
            System.out.println(startAt++);
        }

    }
}
/*
Where did you struggle with this coding work?
I did not
What was easy?
Yes, I found it easy
What questions do you still have?
None at the moment
*/