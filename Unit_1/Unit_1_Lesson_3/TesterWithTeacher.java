package Unit_1_Lesson_3;

import java.util.Scanner;

/**
 * Anthony DeFoe
 * 1/16/2020
 * Calculator app, mr H. did not help me. >:(
 */

public class TesterWithTeacher {

    public static void main(String[] args) {

        //New scanner class for keyboard input:
        Scanner c = new Scanner(System.in);

        //Tells the user how to pick a mode:
        System.out.println("=!= Anthony's Calculator =!=");
        System.out.println("Addition (1) \nSubtraction (2)");
        System.out.println("Multiplication (3) \nDivision (4)");
        System.out.print("Pick Mode Num: ");

        //The next number you type in will be set to "mode":
        int mode = c.nextInt();

        //If you accidentally typed in a incorrect number the program will exit:
        if (mode > 4 || mode < 1) {
            System.out.print("Incorrect mode, please try again.");
            System.exit(0);
        }

        //User input for the numbers to do the operations on:
        System.out.print("\nFirst number: ");
        int n1 = c.nextInt();

        System.out.print("Second number: ");
        int n2 = c.nextInt();

        //Finds the operator methods such as "add()" if the mode matches:
        switch (mode) {
            case 1:
                add(n1, n2);
                break;
            case 2:
                sub(n1, n2);
                break;
            case 3:
                mul(n1, n2);
                break;
            case 4:
                div(n1, n2);
                break;
        }
    }

    /*
        All operation methods are done the same way, just with different
        mathematical operators:
    */

    public static void add(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("\nResult: " + sum);
    }

    public static void sub(int n1, int n2) {
        int sum = n1 - n2;
        System.out.println("\nResult: " + sum);
    }

    public static void mul(int n1, int n2) {
        int sum = n1 * n2;
        System.out.println("\nResult: " + sum);
    }

    public static void div(int n1, int n2) {
        int sum = n1 / n2;
        System.out.println("\nResult: " + sum);
    }
}
