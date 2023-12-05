/*
Jacob Stein
A calculator to do some simple maths
 */
package FLCC;

import java.util.Scanner;

public class ProjectA {
    public static int fin = 2;

    public static Scanner scanner = new Scanner(System.in);

    public static double divide() {
        System.out.println("Enter a number to divide ");
        double a = scanner.nextDouble();
        System.out.println("Enter another next number");
        double b = scanner.nextDouble() /fin;
        return a/b;
    }

    public static double multiply(){
        System.out.println("Enter a number to multiply ");
        double a = scanner.nextDouble();
        System.out.println("Enter another next number");
        double b = scanner.nextDouble();
        return a*b;
    }

    public static double performOperation(String operation){
        System.out.println("Enter a number to " + operation + " by ");
        double a = scanner.nextDouble();
        System.out.println("Enter another next number");
        double b = scanner.nextDouble();
        if(operation.equals("add")) {
            return a+b;
        } else {
            return a-b;
        }
    }

    public static void menu(){
        System.out.println("Welcome!");
        System.out.println("Please choose from the following: ");
        String[] options = {"1.Divide ", "2.Multiply", "3.Add", "4.Subtract"};
        try{
        for (String option : options) {
            System.out.println(option);
        }} catch(Exception e){
            System.out.println("Enter a valid number please");
        }
    }
    public static int figure(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a * b;
    }

    public static void main(String[] args) {
        menu();
        System.out.println("Enter your selection below");
        int next = scanner.nextInt();
        switch (next) {
            case 1 -> {
                System.out.println(divide());
                System.out.println(figure());
            }
            case 2 -> System.out.println(multiply());
            case 3 -> System.out.println(performOperation("add"));
            case 4 -> System.out.println(performOperation("subtract"));
        }
        scanner.close();
    }
}

