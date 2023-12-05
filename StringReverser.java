package FLCC;

import java.util.Scanner;

public class StringReverser {
    public static void main (String[] args) {

        // Instantiate a SCANNER
        Scanner scanner = new Scanner(System.in);

        // Get the string to reverse from the user
        System.out.println("Enter a word or phrase:");
        System.out.println();
        String input = scanner.nextLine();

        System.out.println("REVERSED: ");
        System.out.println();

        // INSERT YOUR CODE HERE:
        // Your code needs to output the characters
        // of the String 'input' in reverse order
        for(int i = input.length()-1; i>-1; i--){
            System.out.print(input.charAt(i) );
        }


    }
}