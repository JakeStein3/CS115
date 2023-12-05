package FLCC;/*
Jacob Stein
3/7/23
To keep asking the user for input until they enter 3 then it stops
 */

import java.util.Scanner;
public class WhileLoopD {
    public static void main(String[] args) {
        whileLoopD();
    }
  //  To keep asking the user for input until they enter 3 then it stops

    public static void whileLoopD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        while(num!=3){
            System.out.println();
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
        }
        System.out.println();
        System.out.println("You chose 3.");







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