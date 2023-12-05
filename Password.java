package FLCC;/*
Jacob Stein
4/3/23
To generate a password based on given rules, and have the user enter their own password and check it against the rules
 */
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class Password {

    public static void main(String[] args) {
        // Create an instance of Scanner
        Scanner sc = new Scanner(in);

        // Call 'displayMenu()' to show the menu to the user
        displayMenu();

        // Read in input from user and assign to 'choice'
        out.println();
        out.println("Please make your selection:");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 :// display password specifications to the user
                out.println();
                    showPasswordSpecifications();
                    break;
            case 2 :    // generate a random password for the user
                out.println();
                out.println("\nYour password is: " + generateRandomPassword(sc));
                    break;
            case 3 : {  // ask the user to input a password and test for validity

                out.println("Enter a password to test:");
                sc.nextLine();
                String input = sc.nextLine();
                if (validatePassword(input)) {
                    out.println("Your password is valid.");

                } else {

                    out.println("Your password is NOT valid.");

                }
            }
            break;
        }
}

    public static void displayMenu() {
        // PRE-CONDITIONS: None
        // POST-CONDITIONS: This method displays the menu of options
        // (as per the specifications)
        out.println("Here is your menu of options:");
        out.println("1. See the password rules");
        out.println("2. Generate a random password");
        out.println("3. Test the validity of a password");

    }

    public static String generateRandomPassword(Scanner sc) {
        // PRE-CONDITIONS: The scanner used to read in the random number generator
        // seed from the user

        // POST-CONDITIONS: A password that satisfies the specifications is
        // generated and returned.

        // This method will return a String password that subscribes to
        // the following criteria:
        // 1. There are eight characters in the password
        // 2. The first two characters are lowercase letters.
        // 3. The second two characters are uppercase letters.
        // 3. The characters in positions 4 and 5 are numbers.
        // 4. The characters in positions 6 and 7 are any character.

        StringBuilder tempPass = new StringBuilder(); // this String will become the password

        out.println("Enter seed:");
        int seed = sc.nextInt();
        Random random = new Random(seed);


        //                   Lower     upper    number     any char
        int[][] charSets = {{97, 26}, {65, 26}, {48, 10}, {33, 94}};

        // For each array in the array
        for (int[] charSet : charSets) {
            int charStart = charSet[0];
            int charLength = charSet[1];

            char char1 = (char) (charStart + random.nextInt(charLength));
            char char2;

            try {
                do {                                                       // To ensure it does not repeat itself
                    char2 = (char) (charStart + random.nextInt(charLength));
                } while (char1 == char2);

                // put it in the tempPass
                tempPass.append(char1);
                tempPass.append(char2);


            } catch (Exception e) {
                out.println("Enter a number");
            }
        }

        return tempPass.toString();    // Make it a string
    }


    public static void showPasswordSpecifications() {
        // PRE-CONDITIONS: None
        // POST-CONDITIONS: The specifications for a valid password are
        // displayed on the screen
        out.println("The rules for your password are:");
        out.println("1. It must be at least 8 characters long");
        out.println("2. At least one letter must be capitalized");
        out.println("3. It must contain at least 2 numbers");


    }

    public static boolean validatePassword(String input) {

        // PRE-CONDITIONS: The main method will pass in a String
        // POST-CONDITIONS: "true" will be returned if the parameter "input" is
        // a valid password, as per the specifications. "false" will be returned otherwise
        //
        // The specifications are:
        // 1. There are at least eight characters in the password
        // 2. At least one of the characters is capitalized
        // 3. There are at least two digits (0-9) in the password

        String passwordSpecs  = "^(?=.*[A-Z])(?=.*\\d.*\\d)[a-zA-Z0-9]{8,}$";
        return input.matches(passwordSpecs);

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
