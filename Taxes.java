package FLCC;

import java.util.Scanner;
/*
Jacob Stein
3/29/2023
To find how much you need to pay in taxes based on yearly income
 */
public class Taxes {
    public static void main(String[] args) {
        //Get input from user and store it to yearlyIncome
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your yearly income:");
        System.out.println();// Blank line
        double yearlyIncome = scanner.nextDouble();


        // Store everything
        double taxRate = 0.15;   // Tax rate of 15 %

        double incomeBracket1 = bracket1(yearlyIncome, taxRate);  // Get the tax rate for Income bracket 1
        double incomeBracket2 = bracket2(yearlyIncome, taxRate);  // Get the tax rate for Income bracket 2
        double incomeBracket3 = bracket3(yearlyIncome, taxRate);  // Get the tax rate for Income bracket 3

        display(incomeBracket1,incomeBracket2,incomeBracket3, yearlyIncome);  // Displays what you owe in taxes based on yearly income

    }
    public static void display(double incomeBracket1, double incomeBracket2, double incomeBracket3, double yearlyIncome){
        if(yearlyIncome<50000){
            System.out.println("Income Bracket 1");
            System.out.println("You owe"+ " " + "$"+incomeBracket1 + " " + "in Federal taxes.");
        } else if(yearlyIncome<100000){
            System.out.println("Income Bracket 2");
            System.out.println("You owe"+ " " + "$"+incomeBracket2 + " " + "in Federal taxes.");
        }
        else {
            System.out.println("Income Bracket 3");
            System.out.println("You owe"+ " " + "$"+incomeBracket3 + " " + "in Federal taxes.");
        }
    }

    public static double bracket1(double yearlyIncome, double taxRate) {
        // find tax rate for bracket 1
        double a = yearlyIncome * taxRate;
        return Math.round(a * 100.0) / 100.0;

    }

    public static double bracket2(double yearlyIncome, double taxRate) {
        //Find income for bracket 2
        double a = yearlyIncome * taxRate;
        return Math.round(a * 100.0) / 100.0;
    }

    public static double bracket3(double yearlyIncome, double taxRate) {
        //Find income for bracket 3
        double a = yearlyIncome * taxRate;
        return Math.round(a * 100.0) / 100.0;
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