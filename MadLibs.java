package FLCC;
import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args) {
        madLib();
    }

    public static void madLib(){
        // Makes a mad lib story using 12 different words

        //Gets all info
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a adjective");
        String adjective = scanner.nextLine();

        System.out.println("Enter a adverb");
        String adverb = scanner.nextLine();

        System.out.println("Enter a noun");
        String noun = scanner.nextLine();

        System.out.println("Enter a verb");
        String verb = scanner.nextLine();

        System.out.println("Enter a proper noun");
        String propNoun = scanner.nextLine();


        // Puts the story together

        System.out.println(noun);





    }
}
