package FLCC;

import java.util.Random;
import java.util.Scanner;

public class RandomSeed {

    public static void main(String[] args) {
        makeRandoms(); // make random things using a seed from the user
    }

    // this method asks the user for a seed for the random number generator
    // and then generates random numbers and chars
    public static void makeRandoms() {

        // Seeding the random number generator
        for (int i = 0; i < 1; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a seed value:");
            int seed = sc.nextInt();
            Random random = new Random(seed);  // Use the seed the user
            int rand1 = random.nextInt(100); // 0-99
            int rand2 = random.nextInt(41) + 10;  // 10-50
            System.out.println("Random Number"+ " " + i +" =" + " " + rand1);
            System.out.println("Random Number"+ " " + i +" =" + " " + rand2);


            // Random chars.. ASCII Table

            // random uppercase letter  65-90  start by subtracting, put that in and add start (65)
            int rand3 = random.nextInt(26) + 65;
            char randomChar = (char)rand3;
            System.out.println(randomChar);


        }
    }
}