package FLCC;/*
Jacob Stein
5/8/23
This program will take english input and output the morse code of it
 */
import java.util.Scanner;
public class FinalProject {
    public static void main(String[] args){
        System.out.println("Welcome to the morse code generator!");
        System.out.println();  // Blank line
        Scanner sc = new Scanner(System.in);  // Make a Scanner
        System.out.println("Enter the text you would like translated to morse code:");

        // store the all the alphabet in a char array
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', '0' };
        // Morse code by indexing
        String[] morse = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };

        String english = sc.nextLine(); // User enters english
        System.out.println();
        // English to morse code
        englishToMorse(morse, english, letters);
    }
    /*
     This method takes in english and gives the morse code translation of it, makes use of nested loops to allow
     each char to be iterated over
    */
    public static void englishToMorse(String[] code, String english, char[] letter){

            System.out.print("The morse code of " +"\""+  english +"\""+ " is " + " ");
            for (int i = 0; i < english.length(); i++) {
                for (int j = 0; j < letter.length; j++) {  // This allows for the phrase entered to be compared with each index of morse code
                    if (english.charAt(i) == letter[j]) {   // If the char at i equals the same position at letter of j
                        System.out.print(code[j] + " ");  // Print it out and add a space after
                        break;
                    }

                }
            }
        }

}
/*
What were the most difficult problems you worked through on this project? How did you solve them?
Making sure to iterate through all letters of the input, figured out you needed a nested loop to do so

Any last questions or thoughts about the project or the course?
None, thanks!
*/
