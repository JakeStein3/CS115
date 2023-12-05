package FLCC;/*
Jacob Stein
2/24/23
Gets input from user and outputs the various String methods while using a switch statement
 */
import java.util.Scanner;

public class StringLab02 {
    public static void main(String[] args) {
        stringWorkSwitch();
    }
   // Gets input from user and outputs the various String methods while using a switch statement to go between inputs

    public static void stringWorkSwitch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a phrase:");
        System.out.println();
        String phrase = sc.nextLine();

        // menu
        System.out.println("1. Find the length of the string");
        System.out.println("2. Perform charAt");
        System.out.println("3. Perform equals");
        System.out.println("4. Perform compareTo");
        System.out.println("5. Perform indexOf");
        System.out.println("6. Perform substring");
        System.out.println("7. Perform toLowerCase");
        System.out.println("8. Perform toUpperCase");
        System.out.println();
        System.out.println("Please make a selection: ");
        System.out.println();
        int plength = phrase.length() -1;

        int sel = sc.nextInt();
        int zero = 0;

        switch (sel) {
            case 1:

                System.out.println("The length of the phrase is " + phrase.length());
                break;
            case 2:
                System.out.println("Enter a number between" + " " +  "0" + " "+ "and "+ plength +":");
                System.out.println();
                int index = sc.nextInt();
                char ch = phrase.charAt(index);
                System.out.println("The character at index " + index + " is" + " " + "\'"+ch +"\'" );
                break;

            case 3:
                System.out.println("Enter a phrase that will be compared with" + " " + "\"" +phrase +"\"" + ":");
                sc.nextLine();
                String secondPhrase = sc.nextLine();
                System.out.println();
                boolean equals = phrase.equals(secondPhrase);
                if (equals) {
                    System.out.println("The two phrases DO have the same sequence of characters.");
                } else {
                    System.out.println("The two phrases DO NOT have the same sequence of characters.");
                }
                break;
            case 4:
                System.out.println("Enter a phrase that will be compared with" + " " +"\"" +phrase +"\"" + ":");
                sc.nextLine();
                String thirdPhrase = sc.nextLine();
                System.out.println();
                int compare1 = phrase.compareTo(thirdPhrase);
                if (phrase.equals(thirdPhrase)) {
                    System.out.println("The two phrases are equivalent.");
                } else if (compare1 > 0) {
                    System.out.println("Alphabetically," + " " +  "\"" + phrase + "\"" + " " + "comes after" + " " + "\"" + thirdPhrase + "\"");
                } else if (compare1<0) {
                    System.out.println("Alphabetically," + " " + "\"" + phrase + "\"" + " " + "comes before" + " " + "\"" + thirdPhrase + "\"");
                }
                break;
            case 5:
                sc.nextLine();
                System.out.println("Enter a String to search " + "\"" + phrase + "\"" + " " +"for:");
                System.out.println();
                String character = sc.nextLine();
                int indexOf = phrase.indexOf(character);
                if (indexOf == -1) {
                    System.out.println("\"" + character + "\"" + " "  + "is not in the phrase" + " " + "\"" + phrase + "\"");
                }
                else {
                    System.out.println("The first occurrence of" +" "+ "\"" + character  + "\"" + " " + "is at index" + " " + phrase.indexOf(character));
                }
                break;
            case 6:
                System.out.println("Choose one of the methods:");
                System.out.println("1"  + "." + " " + "Create a substring from a selected index until the end"
                + "\n" + "2"  + "." +" " + "Create a substring from a selected index until another selected index");
                System.out.println();
                System.out.println("Enter selection:");
                System.out.println();
                int start = sc.nextInt();
                if(start==1){
                    System.out.println("Which index" + " "  + "(between" +" "+ zero + " "+ "and" + " " +plength  + ")"  + " "+  "would you like to start with"  + "?" );
                    System.out.println();
                    int by = sc.nextInt();
                    System.out.println("The new phrase is:" +" " + "\"" +  phrase.substring(by) + "\"");
                }
                else if(start==2){
                    System.out.println("Which index" + " "  + "(between 0 and" + " " +plength  + ")"  + " "+  "would you like to start with"  + "?");
                    int end = sc.nextInt();
                    System.out.println();
                    System.out.println("Which index" + " "  + "(between" + " " + end + " "+  "and" + " " +plength  + ")"  + " "+  "would you like to end with"  + "?");
                    int i = sc.nextInt();
                    System.out.println();
                    String substring = phrase.substring(end, i);
                    System.out.println("The new phrase is:" +" " + "\"" +  substring + "\"");
                }

                break;
            case 7:
                String lowerCase = phrase.toLowerCase();
                System.out.println("All lowercase looks like this:" + " " + "\"" + lowerCase + "\"");
                break;
            case 8:
                String upperCase = phrase.toUpperCase();
                System.out.println("All uppercase looks like this:" + " " + "\"" + upperCase + "\"");
                break;
            default:
                System.out.println("Not a valid number!");
                break;

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
