package FLCC;/*
Jacob Stein
4/26/23
To make an array and fill it will valves between 1 and 100 and print it to the console
 */
import java.util.Scanner;
import java.util.Random;

public class ArrayOutputValues {
    public static void main (String[] args) {

        // instantiate a Scanner object
        Scanner sc = new Scanner(System.in);

        // get input from user for a seed for the random number generator
        System.out.println("seed:");
        int seed = sc.nextInt();

        // get input from user for the size of the array
        System.out.println("length:");
        System.out.println();
        int size = sc.nextInt();

        // instantiate a random number generator with the seed
        Random random = new Random(seed);



        // INSERT YOUR CODE HERE AS SPECIFIED BELOW

        // STEP 1: Create an array of size 'size'
        int [] num = new int [size];


        // STEP 2: Iterate through the array and insert a random 
        //         number between 1 and 100 at every spot

        for(int i =0; i< num.length; i++){
            num[i] = random.nextInt(100) + 1;
        }



        // STEP 3: Display the array using the displayArray method
        displayArray(num);


    }

    // this method takes an array and displays the contents
    // FILL IN THE CODE (IMPLEMENT) THIS METHOD BELOW
    public static void displayArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
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

