package FLCC;/*
Jacob Stein
2/20/23
To use a switch statement and have it output different movie quotes
 */


import java.util.Scanner;

public class Quotes {
    public static void main(String[] args) {
        System.out.println("Enter a number 1-10:");
        getQuotes();  // To use a switch statement and have it output different movie quotes

    }
    public static void getQuotes(){
        // Using a scanner to get input and then using a switch statement to show movie quotes based on the number entered
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        switch (num) {
            case 1 -> {
                System.out.println("QUOTE" + " " + num + ":");
                System.out.println("May the Force be with you.");
                System.out.println("Thank you for getting cultured.");
            }
            case 2 -> {
                System.out.println("QUOTE" + " " + num + ":");
                System.out.println("There's no place like home");
                System.out.println("Thank you for getting cultured.");
            }
            case 3 -> {
                System.out.println("QUOTE" + " " + num + ":");
                System.out.println("I'm the king of the world!");
                System.out.println("Thank you for getting cultured.");
            }
            case 4 -> {
                System.out.println("QUOTE" + " " + num + ":");
                System.out.println("Carpe diem. Seize the day, boys. Make your lives extraordinary.");
                System.out.println("Thank you for getting cultured.");
            }
            case 5 -> {
                System.out.println("QUOTE" + " " + num + ":");
                System.out.println("Elementary, my dear Watson.");
                System.out.println("Thank you for getting cultured.");
            }
            case 6 -> {
                System.out.println("QUOTE" + " " + num + ":");
                System.out.println("It's alive! It's alive!");
                System.out.println("Thank you for getting cultured.");
            }
            case 7 -> {
                System.out.println("QUOTE" + " " + num + ":");
                System.out.println("I'll be back.");
                System.out.println("Thank you for getting cultured.");
            }
            case 8 -> {
                System.out.println("QUOTE" + " " + num + ":");
                System.out.println("You're gonna need a bigger boat.");
                System.out.println("Thank you for getting cultured.");
            }
            case 9 -> {
                System.out.println("QUOTE" + " " + num + ":");
                System.out.println("Here's looking at you, kid.");
                System.out.println("Thank you for getting cultured.");
            }
            case 10 -> {
                System.out.println("QUOTE" + " " + num + ":");
                System.out.println("Houston, we have a problem.");
                System.out.println("Thank you for getting cultured.");
            }
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