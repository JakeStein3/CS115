package FLCC;

import java.util.Scanner;
import java.util.Random;

public class Methods01 {
    public static void main (String[] args) {

        // Instantiate a SCANNER
        Scanner scanner = new Scanner(System.in);

        // Ask for and assign user input to a seed
        System.out.println("Enter the seed: ");
        System.out.println();
        int seed = scanner.nextInt();

        // Instantiate a RANDOM
        Random rand = new Random(seed);

        // Roll 2 dice using the roll method
        int die01 = roll(6, rand);
        int die02 = roll(10, rand);

        // Output the results of the dice roll
        System.out.println("Your roll is " + die01 + " and " + die02 + " for a total of " + (die01 + die02));

    }


    // INSERT YOUR CODE HERE - roll METHOD

    // This method takes two parameters - the number of sides on the die (as an int)
    // and an instance of RANDOM called rand

    // This method should return an int between 1 and 'sides' (inclusive)

    public static int roll(int sides, Random random){
        return random.nextInt(sides)+ 1;

    }


}