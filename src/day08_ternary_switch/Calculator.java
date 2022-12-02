package day08_ternary_switch;

public class Calculator {
    public static void main(String[] args) {

        double num1 = 50;
        double num2 = 5;
        char mathOperator = '+';

        switch (mathOperator) {
            case '+':
                num1 += num2;
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println(" Invalid operator");
        }


    }


}
/*

7. Create a class called Calculator, Given two double variables named n1 & n2,
and a char variable named mathOperator, write a program that can calculate result
 of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

		Note: MUST use switch statement

 */