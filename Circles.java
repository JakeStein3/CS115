package FLCC;/*
Jacob Stein
2/8/23
To find the circumference, area, and bounded area of a circle
 */

import java.util.Scanner;

public class Circles {
    public static void main(String [] args){
        circleInfo();

    }
    // Gets the info from user: Circumference, area and puts out those respected values
    public static void circleInfo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius:");
        double r = scanner.nextDouble();
        double fr = r * 2.0* Math.PI;
        double fa = Math.PI * Math.pow(r, 2);

        System.out.println("CIRCUMFERENCE"  + " = "  + fr);
        System.out.println("AREA" + " = " +   fa);
        System.out.println("ROUNDED AREA"+ " = " + Math.round(fa));










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