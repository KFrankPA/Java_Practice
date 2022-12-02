package day15_whileLoop;

public class DevideTwoNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int count = 0;

        while (a >= b) { // 1   2  3  4  5
            a -= b;      // 50 41 32 23 14 5
            count++;     // 1   2  3  4  5
        }

        System.out.println(count+" with a remainder of "+a);



    }
}
/*
 Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without using
 / (division) and * (multiplication) operators.
 */