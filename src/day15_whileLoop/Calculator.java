package day15_whileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        double num1 = input.nextDouble();

        System.out.println("enter math operator");
        char operator = input.next().charAt(0);

        System.out.println("enter a number");
        double num2 = input.nextDouble();

        while (! (operator == '+' || operator == '-' || operator == '/' || operator == '*')) {
            System.out.println("Please re-enter the math operator");
            operator = input.next().charAt(0);

        }

        if(operator == '+'){
            System.out.println(num1 + num2);
        }else if(operator == '-'){
            System.out.println(num1  - num2);
        }else if(operator == '*'){
            System.out.println(num1 * num2);
        }else{ // /
            System.out.println(num1 / num2);
        }


        input.close();







    }
}
