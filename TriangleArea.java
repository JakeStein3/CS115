package FLCC;/*
Jacob Stein
2/1/23
To find and compute the area of a triangle
 */
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        findArea();  //To find the area and print it out

    }

    private static void findArea() {

        Scanner scanner = new Scanner(System.in);
        //Get height
        System.out.println("Enter the height:");
        double height = scanner.nextInt();
        // Get base
        System.out.println("Enter the base:");
        double base = scanner.nextInt();

        // Gets the area
        double half = .5;
        double area = half * (base * height);

        // Print it
        System.out.println( "The area of the triangle is "+ area);

    }

}
/*
Where did you struggle with this coding work?
I did not struggle with this.
What was easy?
Yes it was easy for me.
What questions do you still have?
None at the moment.
*/
