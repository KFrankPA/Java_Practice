package day09_scanner;

import java.util.Scanner;

public class ScannerIntro2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first decimal number:");
        float num1 = input.nextFloat();

        System.out.println("Enter you second number");
        double num2 = input.nextDouble();

        System.out.println("Enter True or False ");
        boolean result = input.nextBoolean();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("result = "+ result);

        input.close();













    }



}

