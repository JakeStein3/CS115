package FLCC;/*
Jacob Stein
4/26/23
To make an array and then double the valves and print them out
 */
import java.util.Scanner;
import java.util.Random;

public class ArrayDoubleValues {

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
        int [] num = new int[size];



        // STEP 2: Iterate through the array and insert a random
        //         number between 1 and 100 at every spot

        for(int i =0; i< num.length; i++){
            num[i] = random.nextInt(100) + 1;
        }


        // STEP 3: Display the original array using the displayArray method
        displayArray(num);


        // STEP 4: Iterate through the array and double each value
        //         (make a void method that takes the array as a parameter)

            arrayDouble(num);

        // STEP 5: Display the updated array using the displayArray method

    }
//  This method takes the array and doubles the output of the first array
    public static void arrayDouble(int [] arr){
        for(int i =0; i< arr.length; i++){
            arr[i] = arr[i] * 2;
        }

    }

    // this method takes an array and displays the contents
    // FILL IN THE CODE (IMPLEMENT) THIS METHOD BELOW
    public static void displayArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i * 2 + " ") ;
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
