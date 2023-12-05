package FLCC;

import java.util.Scanner;

/*
Jacob Stein
4-17-23
To ask the user for a phrase and put a space after every letter in phrase
 */
public class ForLoopC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loopC(scanner);

    }
    static void loopC(Scanner scanner){
       // To ask the user for a phrase and put a space after every letter in phrase
        System.out.println("Enter a phrase:");
        String phrase = scanner.nextLine();
        System.out.println();

        for(int i = 0; i<phrase.length(); i++){
            System.out.print( phrase.charAt(i) + " ");
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
