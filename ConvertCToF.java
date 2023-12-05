package FLCC;/*
Jacob Stein
2/8/23
To convert from C to F
 */
import java.util.Scanner;
public class ConvertCToF {
    public static void main(String[] args) {
        convertCToF();

    }
    // To convert a temperature from Celsius to Fahrenheit
    private static void convertCToF() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature:");
        double c = scanner.nextDouble();

        double f = 1.8 * (c) + 32.0;

        System.out.println("In Fahrenheit, the temperature is" + " " + f);





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
