package FLCC;/*
Jacob Stein
3/22/23
Write a program that asks the user for an int and uses it as a seed for the random number generator.
 */

import java.util.Random;
import java.util.Scanner;

public class RandomChars {
    public static void main(String[] args) {
       int b = randomAll();
        System.out.println(b);

    }
    /*   Write a program that asks the user for an int and uses it as a seed for the random number generator.
          Needs an uppercase and lower case, and needs a digit between 0 and 9
      */
    public static char randomAll(){
        // Set up

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a seed for the random number generator:");
        int seed = scanner.nextInt();
        Random random = new Random(seed);

        //Define the randoms

        int rand1 = random.nextInt(26) + 65;  // uppercase
        int rand2 = random.nextInt(26) + 97;  // lowercase
        int rand3 = random.nextInt(10) + 48;   // 0-9 number

        //Make them chars

            char upperChar = (char) rand1;
            char lowerChar = (char) rand2;
            char numChar = (char) rand3;
            char all = (char) (lowerChar+upperChar+numChar);


        return all;
        // Print it out


/*
 int counter = 0;
        for (int i = 0; i < 8; i++) {
            switch (counter++) {
                case 1:
                    tempPass.append(lowerChar);
                    break;
                case 2:
                    tempPass.append(lowerCHar);
                    break;
                case 3:
                    tempPass.append(upperChar);
                    break;
                case 4:
                    tempPass.append(upperCHar);
                    break;
                case 5:
                    tempPass.append(num);
                    break;
                case 6:
                    tempPass.append(num1);
                case 7:
                    tempPass.append(anyChar);
                    break;
                case 8:
                    tempPass.append(anyCHar);
                    break;
                     /* // IF-ELSE statements to decide which method to call
        if (choice == 1) {    // display password specifications to the user

            showPasswordSpecifications();

        } else if (choice == 2) {	// generate a random password for the user

            out.println("\nYour password is: " + generateRandomPassword(sc));

        } else if (choice == 3) {   // ask the user to input a password and test for validity
            int a = 8;
            out.println("\nEnter a password to test:");
            sc.nextLine();
            String input = sc.nextLine();

            if (validatePassword(input,a)) {

                out.println("\nYour password is valid.");

            } else {

                out.println("\nYour password is NOT valid.");

            }

        } else {

            out.println("Sorry! That was an invalid option.");

        }

        // close the scanner
        sc.close();

            }
        }
 */
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
