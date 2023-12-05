package FLCC;

import java.util.Scanner;

public class Loop02 {
    public static void main (String[] args) {

        // Instantiate a SCANNER
        Scanner scanner = new Scanner(System.in);

        // Prompt user for an 'incrementor'
        System.out.println("Increment by?");
        int incrementor = scanner.nextInt();
        System.out.println();

        // INSERT YOUR CODE HERE
        // Output a series of numbers, starting at -10 and
        // ending at a number no greater than 100
        // Each subsequent number should be increased by the value of incrementor
        for(int i = -10; i<=100; i= i + incrementor){
            System.out.println(i);
        }

    }
}