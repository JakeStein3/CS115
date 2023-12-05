package FLCC;

import java.util.Scanner;

public class FormatMe {
    public static void main(String[] args) {

// three methods are called that do things

        Method1();
        method2();
        method3();

    }

    public static void Method1() {

        int firstNumber = 1;
        double secondNumber = 2.34;
        char ch = 'J';

        System.out.println("The first number is " + firstNumber);
        System.out.println("The second number is " + secondNumber);
        System.out.println("The char is " + ch);
        System.out.println();

    }

    public static void method2() {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x == 2) {
            System.out.println("First, solve the problem. Then, write the code. (J. Johnson)");
        }  if(y <= 0) {
            System.out.println("Experience is the name everyone gives to their mistakes. (O. Wilde)");

        }  if(z > 50) {
                System.out.println("Code is like humor. When you have to explain it, it is bad. (C. House)");
            }

         if(z>100) {
            System.out.println("Knowledge is power. (F. Bacon)");
        }

        System.out.println("So many quotes, so little time...");
        System.out.println();
        sc.close();
    }

    public static void method3() {

        int start = 0;
        boolean bool = true;

        while(start < 10) {
            System.out.println(start+ 1 + " " + bool);
            start += 2;
            bool = !bool;
        }

        if(bool) {
            System.out.println("The variable is true.");
        }

        System.out.println();
        System.out.println("THE END");
    }



}