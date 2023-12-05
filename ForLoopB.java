package FLCC;

import java.util.Scanner;

/*
Jacob Stein
4-17-23
To use a for loop and ask for two points and print out 10 values
 */
public class ForLoopB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        forLoopB(scanner);

    }
    static void forLoopB(Scanner scanner) {
        //To use a for loop and ask for two points and print out 10 values after the fact

        System.out.println("Enter a number to start at:");
        int startAt = scanner.nextInt();

        System.out.println("Enter a number to increase by:");
        int incrementer = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < 1; i++) {
            System.out.println(startAt);
            for (int j = 0; j < 9; j++) {
                System.out.println(startAt += incrementer);
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
