package FLCC;/*
Jacob Stein
2/15/2022
To ask a user for an int and compare it to the number 10
 */
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        compare();
    }

    // Ask user for int and compare it to the number 10 by using a scanner and an if else statement
    public static void compare(){
        //Create Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int numInput = scanner.nextInt();

        if(numInput > 10){
            System.out.println("The number" +" " + numInput + " " + "is GREATER than 10.");
            System.out.println("Program finished!");
        } else {
            System.out.println("The number" + " " + numInput +" " + "is NOT GREATER than 10.");
            System.out.println("Program finished!");

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