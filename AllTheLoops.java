package FLCC;

import java.util.Random;
import java.util.Scanner;
/*
Jacob Stein
4-17-23
To use a for loop, a while loop, and a do while loop
 */
public class AllTheLoops {

   public static Scanner scanner = new Scanner(System.in);  // Make a new instance of a Scanner

    public static void main(String[] args) {

        forLoop();   // Using a for loop for step 1

        whileLoop();  // Using a while loop for step 2

        doWhile();  // Using a do while loop for step3

    }
    public static void whileLoop(){
        System.out.println("WHILE LOOP");
        System.out.println("Please enter a seed for the random number generator:");
        System.out.println();  // Blank Line
        int seed = scanner.nextInt();
        scanner.nextLine();
        Random random = new Random(seed);
        boolean contiune = true;
        while(contiune){
            int randomNumber = random.nextInt(50) +1;
            System.out.println("Here's your random number:" +" "+ randomNumber);
            System.out.println("Would you like another number? Enter 'stop' to stop.");
            String choice = scanner.nextLine();
            if(!choice.equalsIgnoreCase("stop")){
                continue;
            }
            else{
                contiune = false;
            }
        }


        System.out.println();
        System.out.println();
    }

    public static void doWhile() {
        System.out.println("DO-WHILE LOOP");
        int sum = 0;
        int count = 0;
        int number;
        do {
            System.out.println("Enter a number (0 to stop and print average):");
            number = scanner.nextInt();
            sum += number;
            count++;
        } while (number != 0);

        if (count > 1) {
            double average = (double) (sum) / (count - 1);
            System.out.println("The average of your numbers is:" + " " + average);
        } else {
            System.out.println("You need to enter at least two numbers to compute the average.");
        }
    }
    public static void forLoop(){
        System.out.println("FOR LOOP");
        System.out.println("Please enter a starting point for your for loop:");
        int startAt = scanner.nextInt();

        System.out.println("Please enter an ending point for your for loop:");
        int endAt = scanner.nextInt();

        System.out.println("What value would you like the for loop to go up by?");
        int increment = scanner.nextInt();
        System.out.println();

        System.out.println("Your numbers:");
        for (int i = startAt; i <= endAt; i += increment) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
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


