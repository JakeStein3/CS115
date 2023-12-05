package FLCC;
/*
Jacob Stein
A game resenting financial literacy and showing the hardships of life
5/2/23
 */
import java.util.Scanner;

public class RichManPoorMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Introduction
        System.out.println("Welcome to Rich Man Poor Man! This game will test your financial decision-making skills and show you the impact of financial hardship.");

        // Game Loop
        while (true) {
            // Question 1
            System.out.println("You receive a large bonus at work. What do you do?");
            System.out.println("1. Spend it on a vacation");
            System.out.println("2. Save it for a rainy day");
            System.out.println("3. Invest it for long-term growth");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Spending the bonus on a vacation may be enjoyable, but it doesn't help your long-term financial goals. You lose 5 points.");
                    score -= 5;
                    break;
                case 2:
                    System.out.println("Saving the bonus for a rainy day is a wise move. You gain 10 points.");
                    score += 10;
                    break;
                case 3:
                    System.out.println("Investing the bonus for long-term growth can help you achieve your financial goals faster. You gain 15 points.");
                    score += 15;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            // Question 2
            System.out.println("You're looking to buy a car. How do you pay for it?");
            System.out.println("1. Take out a loan");
            System.out.println("2. Pay cash");
            System.out.println("3. Lease it");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Taking out a car loan can be costly in the long run due to interest payments. You lose 5 points.");
                    score -= 5;
                    break;
                case 2:
                    System.out.println("Paying cash for a car can save you money in interest payments. You gain 10 points.");
                    score += 10;
                    break;
                case 3:
                    System.out.println("Leasing a car can be convenient, but you'll never own the car and may end up paying more in the long run. You lose 10 points.");
                    score -= 10;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            // Question 3
            System.out.println("You're considering opening a credit card. What do you do?");
            System.out.println("1. Sign up for the card to build credit");
            System.out.println("2. Avoid credit cards altogether");
            System.out.println("3. Research credit cards and choose the best one for your needs");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Opening a credit card can be a good way to build credit, but only if you use it responsibly. You gain 5 points.");
                    score += 5;
                    break;
                case 2:
                    System.out.println("Avoiding credit cards altogether can be a good way to avoid debt, but it may hurt your credit score in the long run. You lose 5 points.");
                    score -= 5;
                    break;
                case 3:
                    System.out.println("Researching credit cards and choosing the best one for your needs can help you save money and build credit. You gain 10 points.");
                    score += 10;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            choice = scanner.nextInt();

            // Question 4
            System.out.println("You're trying to save for a down payment on a house. What do you do?");
            System.out.println("1. Put your money in a high-interest savings account");
            System.out.println("2.Put your money in a normal savings account");

            switch(choice) {
                case 1:
                    System.out.println("A high intrest savings account is a good idea and can be a good way for your money grow");
                    score += 5;
                    break;

                case 2:
                    System.out.println("A basic savings account does not grow your money but does allow it to be saved  ");
                    score+= 1;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            choice = scanner.nextInt();

                    // Feedback
            if (score <= -50) {
                System.out.println("You've fallen on hard times and are now in debt. Consider seeking help from a financial advisor.");
            } else if (score <= 0) {
                System.out.println("You're barely making ends meet. Try to save more and cut back on unnecessary expenses.");
            } else if (score <= 50) {
                System.out.println("You're doing okay financially, but could still improve by investing and increasing your income.");
            } else {
                System.out.println("Congratulations, you're a financial whiz! Keep up the good work.");
            }

            // Scoring
            System.out.println("Your current score is: " + score);

            // Ask if the user wants to play again
            System.out.println("Do you want to play again? (Y/N)");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("Y")) {
                break;
            }
        }

        // Conclusion
        System.out.println("Thanks for playing Rich Man Poor Man!");
    }
}
