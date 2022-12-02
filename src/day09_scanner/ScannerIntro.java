package day09_scanner;

import java.util.Scanner;
// import java.util.*;

public class ScannerIntro {

    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in); //reading user inputs

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");

        int num1= input.nextInt();

        System.out.println("Enter your second number: ");

        short num2 = input.nextShort();

        System.out.println("Enter your third number: ");
        int num3 = input.nextInt();

        System.out.println("Enter your fourth number: ");
        long num4 = input.nextLong();

input.close(); // scanner is closed, can not read user inputs
/*
        System.out.println("enter you fifth number");
        int num5 = input.nextInt();
        Scanner is closed at line 29
*/

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Fourth number: " +num4 );



    }


}
