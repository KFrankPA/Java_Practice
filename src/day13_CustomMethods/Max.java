package day13_CustomMethods;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");

        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner((System.in)).nextInt();
        System.out.println(max(num1, num2));


    }



    public static String max(int n1, int n2) {

        String result = "";

        if (n1 > n2) {
           result = "n1 is bigegr ";

        } else {
            result = "n2 is bigger ";
        }

       return result;

        }



}