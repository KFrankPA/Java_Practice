package day09_scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int fistNumber = input.nextInt();

        System.out.println("Enter  a math operator");
        char mathOperator = input.next().charAt(0);

        System.out.println("Enter the second number");
        double secondNumber = input.nextInt();
        double result= 0;

        if (mathOperator == '-' || mathOperator == '+' || mathOperator == '*' || mathOperator == '/') {
            if (mathOperator == '-') {
                result=fistNumber - secondNumber;
            } else if (mathOperator == '+') {
                result = fistNumber + secondNumber;
            } else if (mathOperator == '*') {
                result = fistNumber * secondNumber;
            } else {
                result = fistNumber / secondNumber;
            }
        }else{
            System.out.println("Invalid math operator");
        }
        System.out.println(result);
        input.close();
    }
}
/*
Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a valid math operator (+, -, *, /), then print "Invalid entry"

 */