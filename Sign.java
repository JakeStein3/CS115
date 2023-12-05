package FLCC;/*
Jacob Stein
2/20/23
This program will compare an input and output the sign of the number (-, + , 0)
 */
import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        findTheSign(); // This program will compare an input and output the sign of the number (-, + , 0)

    }
    public static void findTheSign(){
        // To take an input and find the sign of the number to the screen using an if, else

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number:");

        int num = scanner.nextInt();

        if(num>0){
            System.out.println("The number is positive.");
        }else if(num==0){
            System.out.println("The number is zero.");
        }else{
            System.out.println("The number is negative.");

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

