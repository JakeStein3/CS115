package FLCC;/*
Jacob Stein
2/1/23
To find the perimeter and area of the square, then prints them out
 */
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        findSquareStuff(); // this method gets a number from the user
        // and outputs the perimeter and area of the square

    }

    // this method gets a number from the user,
    // calculates the perimeter and area of the square, and outputs them
    public static void findSquareStuff() {


        Scanner scanner = new Scanner(System.in);

        // Prompt the user for side length and store the input in the variable length
        System.out.println("Enter the length:");
        System.out.println();
        double length = scanner.nextDouble();

        //Gets the perimeter
        double four = 4.0;
        double perimeter = length * four;

        //Gets area
        double area = length * length;

        // Prints it out
        System.out.println("The perimeter of the square is" + " " + perimeter);
        System.out.println("The area of the square is"+ " " + area);

    }
}
/*
Where did you struggle with this coding work?
I did not struggle with this code
What was easy?
Yes, this was easy for me
What questions do you still have?
None at the moment
*/
