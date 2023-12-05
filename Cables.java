package FLCC;

import java.util.Scanner;
/*
Jacob Stein
3/6/2023
To find and output the number of cables with its cost
 */
public class Cables {
    public static void main(String[] args) {
        cableCost();

    }
    // To use if/else statements in order to find and output the cost of the cables with respect to its amount
    public static void cableCost(){
        Scanner scanner = new Scanner(System.in); // create the scanner
        System.out.println("How many cables are you buying?");  // Prints first line
        double amount = scanner.nextDouble();

        if(amount < 2){
            double cost = 7.99;
            double finalCost = cost * amount;
            System.out.println("The total cost of the cables is $" + finalCost);

        } else if(amount<= 5){
            double cost = 6.49;
            double finalCost = cost * amount;
            System.out.println("The total cost of the cables is $" + finalCost);


        }else if(amount > 5){
            double overFive = 4.99;
            double finalCost = overFive * amount;
            System.out.println("The total cost of the cables is $" + finalCost);
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