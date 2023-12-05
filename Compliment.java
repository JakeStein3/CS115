package FLCC;/*
Jacob Stein
2/15/2023
To dole out a compliment if the user wants one
 */

import java.util.Scanner;

public class Compliment {

    public static void main(String[] args) {
        compliment();
    }

    //This program will dole out a compliment if the user wants one.

    public static void compliment(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like a compliment" + " " +"(\"1\" for YES," + " \"2\" for NO)" + "?");
        int c = scanner.nextInt();
        if(c==1){
            System.out.println("You are an amazing programmer.");
            System.out.println("Game Over");
        }

        else if (c==2){
            System.out.println("Game Over");
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