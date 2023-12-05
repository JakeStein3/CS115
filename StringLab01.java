package FLCC;/*
Jacob Stein
2/24/2023
Gets input from user and outputs the various String methods
 */
import java.util.Scanner;

public class StringLab01 {
    public static void main(String[] args) {
        stringWork();

    }
    // Gets input from user and outputs the various String methods
    public static void stringWork(){


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a phrase: ");
        System.out.println();
        String phrase = input.nextLine();
        System.out.println("Please enter a character to search for: ");
        System.out.println();

        char character = input.next().charAt(0);
        int length = phrase.length();
        int index = phrase.indexOf(character);
        char fc = phrase.charAt(0);
        char lc = phrase.charAt(length - 1);

        System.out.println("The length of your String is " + length + ".");
        System.out.println("The character in the first position is '" + fc + "'.");
        System.out.println("The character in the last position is '" + lc + "'.");
        System.out.println("The first occurrence of '" + character + "' is in index " + index + ".");

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
