package FLCC;
/*
Jacob Stein
4/26/23
To shift an array to the left
 */
import java.util.Random;
import java.util.Scanner;
public class ArrayShiftLeft {

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
            int[] num = new int[size];


            // STEP 2: Iterate through the array and insert a random
            //         number between 1 and 100 at every spot

            for (int i = 0; i < num.length; i++) {
                num[i] = random.nextInt(100) + 1;
            }


            // STEP 3: Display the array using the displayArray method
            displayArray(num);
            System.out.println();


            // STEP 4: Iterate through the array and shift each value
            //         one spot to the left, and move the first value
            //         to last index
            //         (make a void method that takes the array as a parameter)

            // Example:
            // Array BEFORE shift: 28 70 88 91 41 74 29 50 85 65
            // Array AFTER shift:  70 88 91 41 74 29 50 85 65 28
                shiftLeft(num);



            // STEP 5: Display the updated array using the displayArray method
            displayArray(num);





        }
        // This method makes the array shift to the left
        public static void shiftLeft(int[] arr){
            int n = arr.length-1;
            int last = arr[0];
            for(int i = 0; i<n; i++){
                arr[i] = arr[i + 1];
            }
            arr[n] = last;
        }

        // this method takes an array and displays the contents
        // FILL IN THE CODE (IMPLEMENT) THIS METHOD BELOW
        public static void displayArray(int[] arr) {
            for(int j: arr){
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