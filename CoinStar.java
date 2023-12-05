package FLCC;/*
Jacob Stein
2/8/23
To act like a Coins-tar and take a amount of money and find what the customer gets back
 */
import java.util.Scanner;

public class CoinStar {
    public static void main(String[] args) {
        getInfo();



    }
    // Gets the info from customer, then outputs the results
    public static void getInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies did you insert?");

        int totalPennies = scanner.nextInt();
        final double PERCENT = .20;
        double totalAmount = (double)totalPennies / 100;
        double processFee = totalAmount * PERCENT;
        double totalEarned = totalAmount - processFee;

        System.out.println("You have deposited " + "$"+ totalAmount);
        System.out.println("The processing fee is " +"$"+ processFee);
        System.out.println("You earned" + " $" + totalEarned );
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