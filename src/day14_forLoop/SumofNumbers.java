package day14_forLoop;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 0; i <= num ; i++) {
            sum += i;

        }
        System.out.println(sum);

    }
}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

 */