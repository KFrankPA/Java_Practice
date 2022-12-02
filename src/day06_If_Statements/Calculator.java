package day06_If_Statements;

public class Calculator {
    public static void main(String[] args) {
        double num1 = 5,
                num2 = 20;
        String result = "";
        char mathOperator = '+';
        if (mathOperator == '+') {
            System.out.println(num1 + num2);
        }
        if (mathOperator == '-') {
            System.out.println(num1-num2);
        }
        if(mathOperator == '/'){
            System.out.println(num1 / num2);
        }
    if(mathOperator == '*'){
        System.out.println( num1 * num2);
    }
    if(mathOperator != '+' && mathOperator != '-' && mathOperator != '*' && mathOperator != '/') {
        System.out.println(" invalid operator");
    }

    }
}
/*
3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

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
 */