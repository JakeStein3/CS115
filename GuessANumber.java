package FLCC;
/*
Jacob Stein
3/20/23
This program gets a random number and input from the user to see if the number is equal to input
 */

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        boolean playAgain = true;

        while (playAgain) {
            guessTheNum(scanner);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainStr = scanner.next().toLowerCase();
            if (!playAgainStr.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing!");
    }

    // To get a random number and input from the user to see if the number is equal to input
    public static void guessTheNum(Scanner scanner) {
        Random random = new Random();
        int targetNum = random.nextInt(100) + 1;
        int guess = -1;
        int i = 0;

        while (guess != targetNum) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            if (guess < targetNum) {
                System.out.println("Too low. Guess again:");
            } else if (guess > targetNum) {
                System.out.println("Too high. Guess again:");
            } else {
                System.out.println("Congratulations. You guessed correctly!");
                System.out.println("You needed" + " " + (i+1) + " guesses.");
            }
            i++;
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
