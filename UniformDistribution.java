package FLCC;/*
Jacob Stein
5/2/23
To create a program to show Uniform Distribution in a "Random Number" group
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UniformDistribution {
    static Scanner scanner = new Scanner(System.in);  // New Scanner made static to use in the program
    static String[] numberContainer = new String[10];  // New String [] made static to use in the program

    public static void main(String[] args) {
        System.out.println("Enter seed:");
        int seed = scanner.nextInt();    // Make the seed
        System.out.println();
        Random random = new Random(seed);   // Make the random
        System.out.println("How many values would you like to test?");
        int trial = scanner.nextInt();
        System.out.println();

        initializeArray();  // Make array have blank strings

        runTrials(trial, seed, random, numberContainer);   // Run the trials, create random numbers

        displayMetrics(); // Display the array


    }

    // This method makes use of the static array and makes every one a blank string ready to be used
    public static void initializeArray() {
        Arrays.fill(numberContainer, " ");
    }


    // This method will assign a "-" to each position in array based on the random number
    public static void runTrials(int trials, int seed, Random random, String[] array) {
        try {
            for (int i = 0; i < trials; i++) {
                int randomIndex = random.nextInt(array.length);
                array[randomIndex] += "-";
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please enter a new number");
        }
    }


    // This method will display everything on a separate line
    public static void displayMetrics() {
        for (int i = 0; i < numberContainer.length; i++) {
            String value = numberContainer[i];
            int count = value == null ? 0 : value.length() - 1;
            System.out.println(i + ":" + value + " " + count);
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




