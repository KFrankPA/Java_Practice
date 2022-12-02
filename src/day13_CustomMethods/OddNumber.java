package day13_CustomMethods;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();

        oddNum(num);
        System.out.println(oddNum(num));

    }

    public static boolean oddNum(int n1){

        return  (n1 % 2 !=0)? true : false;


    }
}
