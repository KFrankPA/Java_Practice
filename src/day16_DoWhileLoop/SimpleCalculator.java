package day16_DoWhileLoop;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double result = 0;
        String answer = "yes";

             while(answer.equals("yes")){ //  while (true) {
            System.out.println("Enter a number");
            double num1 = sc.nextDouble();

            System.out.println("enter a math operator");
            char operator = sc.next().charAt(0);

            while (!((operator == '+') || (operator == '-') || (operator == '*') || (operator == '/'))) {
                System.err.println("Invalid math operator! Please enter again");
                operator = sc.next().charAt(0);
            }

            System.out.println("Enter second number");
            double num2 = sc.nextDouble();

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else {
                result = num1 / num2;
            }
            System.out.println(result);

            System.out.println("Would you like to continue? Yes/No");
            answer = sc.next().toLowerCase();
            while (!((answer.equals("yes")) || (answer.equals("no")))) {
                System.out.println("Invalid Answer! Would you like to continue? Yes/No");
                answer = sc.next().toLowerCase();
            }

        }
    }
}