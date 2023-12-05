package FLCC;

import java.util.Scanner;
/*
Jacob Stein
3/6/23
To use a while loop to print out the number and do this for a number of times
 */
public class WhileLoopB {
    public static void main(String[] args) {
        useWhiles();



    }
   // To use a while loop to print out the number and do this 10 times

    public static void useWhiles(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        System.out.println();

        int num= scanner.nextInt();
        int counter = 0;

        while (counter < 10) {
            System.out.println(num + 1);
            counter++;
            num++;
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
