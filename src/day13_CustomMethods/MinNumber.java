package day13_CustomMethods;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

        System.out.println("Enter two numbers");
        int n1 = new Scanner(System.in).nextInt();
        int n2 = new Scanner(System.in).nextInt();

        System.out.println(minNumber(n1,n2));

    }
    public static int minNumber(int num1, int num2){

        return (num1<num2)? num1 : num2;

    }
}
