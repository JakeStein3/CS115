package FLCC;

import java.util.Scanner;

public class BetterCircles {
    public static void main(String [] args){
        // Get input from user and store it to radius
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius:");
        double radius = scanner.nextDouble();

        double area = calcArea(radius);  // Returns PI * radius to the second power

        int roundedArea = calcRoundedArea(area);   // Returns the rounded area

        double cirCum = calcCirCum(radius);// Return 2 * PI * radius

        display(cirCum,area,roundedArea);  // Displays the results to the screen

    }
    private static void display(double cirCum, double area, int roundedArea) {
        // Gets the info from user: Circumference, area and puts out those respected values

        System.out.println("CIRCUMFERENCE"  + " = "  + cirCum);  // Displays the Circumference
        System.out.println("AREA" + " = " +   area);      // Displays the area
        System.out.println("ROUNDED AREA"+ " = " + roundedArea);    // Displays the rounded area to the nearest integer

    }

    public static double calcCirCum(double radius){
        // Calculate and return from Circumference
        return radius * 2.0* Math.PI;

    }
    public static double calcArea(double radius){
        // Calcs the area of it by using the equation for area
        return Math.PI * Math.pow(radius, 2);

    }

    public static int calcRoundedArea(double area){
        // Calcs the rounded area to the nearest integer
        return Math.toIntExact(Math.round(area));

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