package FLCC;

import java.util.Scanner;

public class Loop01 {
    public static void main (String[] args) {

        // Create an instance of SCANNER
        Scanner scanner = new Scanner(System.in);

        // Get the 'upperLimit' from the user
        System.out.println("Enter the upper limit:");
        int upperLimit = scanner.nextInt();
        System.out.println();


        // INSERT YOUR CODE HERE
        // Output a consecutive series of numbers, starting at 0
        // and ending at a upperLimit (inclusive)
        for(int i = 0; i<=upperLimit; i++){
            System.out.print(i+ " ");
        }

    }
}