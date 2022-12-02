package day13_CustomMethods;

import java.util.Scanner;

public class isEven {
    public static void main(String[] args) {

        System.out.println("Enter the number");

        int num = new Scanner(System.in).nextInt();
        System.out.println(isEven(num));


    }
    public static boolean isEven(int n1){

        return (n1 % 2 ==0)? true : false ;
    }
}
