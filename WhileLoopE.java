package FLCC;

import java.util.Scanner;

/*
Jacob Stein
3/8/23
Program that will ask the user if they want to play a game.
 */
public class WhileLoopE {
    public static void main(String[] args) {
        whileLoopE();

    }
    //Program that will ask the user if they want to play a game and if they enter no it asks again

    public static void whileLoopE(){
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("no")) {
            System.out.println();
            System.out.print("Would you like to play a game?");
            System.out.println();
            input = scanner.nextLine();
        }

        System.out.println("Game over.");
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