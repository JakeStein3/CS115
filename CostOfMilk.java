package FLCC;

import java.util.Scanner;

public class CostOfMilk {
    public static void main (String[] args) {

        // Create an instance of SCANNER
        Scanner scanner = new Scanner(System.in);

        // Get the 'numOfGallons' from the user
        System.out.println("Enter the number of gallons you are purchasing:");
        int numOfGallons = scanner.nextInt();
        System.out.println();
        /*
        Milk costs $2.09 per gallon for orders of 6 gallons or less
        Milk costs $1.99 per gallon for orders of more than 6 gallons
         */

        // INSERT YOUR CODE HERE
        // Calculate and display the cost of the milk being purchased
        if(numOfGallons<7){
            double b = numOfGallons * 2.09;
            System.out.println("The total cost of the milk is" + " " + "$" + b);
        }
        else{
            double c = numOfGallons * 1.99;
            System.out.println("The total cost of the milk is" + " " + "$" + c);
        }
    }
}
