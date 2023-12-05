package FLCC;

import java.util.Scanner;

/*
Jacob Stein
3/7/23
To print out a series of numbers based on input from user
 */
public class WhileLoopC {
    public static void main(String[] args) {
        whileLoopC();

    }


    public static void whileLoopC() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter starting number:");
        int num= scanner.nextInt();
        System.out.println();
        System.out.println("Enter incrementor:");
        int inc = scanner.nextInt();
        System.out.println();


        int counter = 0;


        while (counter < 6) {
            while(counter == 0){
                System.out.println(num);
                counter++;
            }
            System.out.println(num + inc);
            counter++;
            num = num +inc;
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