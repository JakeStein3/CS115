package FLCC;
/*
Jacob Stein
2/15/2023
The computer flips a coin and the user makes a guess
 */

import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args) {

        headsOrTails(); // the computer simulates flipping a coin
        // and the user guesses the result

    }

    // In this method, the computer simulates flipping a coin.
    // The user guesses the result, and the computer reports if they are correct.

    // The computer will use 0 to represent "heads" and 1 to represent "tails"
    // on the coin toss.

    public static void headsOrTails() {

        // computer randomly picks a number 0 or 1
        int flip = (int) (Math.random() * 2);
        Scanner scanner = new Scanner(System.in);

        System.out.println("0 is heads and 1 is tails.");
        System.out.println("What is your guess (0 or 1)?");

        int guess = scanner.nextInt();

        if (guess == flip){
            System.out.println("The computer got " + flip + ".");
            System.out.println("You guessed right!");
        }
        else{
            System.out.println("The computer got " + flip + ".");
            System.out.println("Sorry, try again next time!");
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