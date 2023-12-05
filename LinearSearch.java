package FLCC;

import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
    public static void main (String[] args) {

        // Declare an instance of SCANNER, get 'seed' from user, and get 'target' from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the seed: ");
        int seed = scanner.nextInt();
        System.out.println("Enter the target: ");
        int target = scanner.nextInt();

        // Create an instance of RANDOM
        Random random = new Random(seed);

        // Create an array of ints that is 20 elements long
        int[] arr = new int[20];

        // Populate array with ints valued 1-1000
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000) + 1;
        }

        // Display the contents of the array
        System.out.print("\nArray: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.println(lin(arr,target));
    }
        public static int lin(int[]arr, int target) {
            // INSERT YOUR CODE HERE
            // Output -1 if 'target' is not in the array
            // Output the index number of 'target' in 'arr'
            for(int i=0;i<arr.length;i++){
                if(arr[i] == target){
                    return i;
                }
            }
            return -1;

        }


}