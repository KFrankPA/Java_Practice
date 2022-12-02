package day13_CustomMethods;



import java.util.Scanner;

public class WarmupTasks {

    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 numbers and math operator");
        double n1 = scan.nextDouble(),
                n2= scan.nextDouble();
        char operator = scan.next().charAt(0);

        calculate(n1, n2 , operator);
scan.close();
    }

    public static void calculate(double num1, double num2, char mathOperator){

        //double
        String result = "";

        switch (mathOperator){
            case '+': result = num1 + " + " +  num2 +" = " + (num1+num2);
            break;
            case '-': result = num1 + " - " +  num2 +" = " + (num1-num2);
            break;
            case '*': result = num1 + " * " +  num2 +" = " + (num1*num2);
            break;
            case '/': result = num1 + " / " +  num2 +" = " + (num1/num2);
            break;
            default:
                System.err.println("Invalid math operator");
        }
        System.out.println(result);


    }
}
