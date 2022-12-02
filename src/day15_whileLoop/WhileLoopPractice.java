package day15_whileLoop;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        while (! (age >=1 && age <= 150)) { // while age is invalid
            System.out.println("Invalid entry! Please re-enter your age");
            age = scan.nextInt();


        }
            if (age > 21) {
                System.out.println("You are eligible");

            } else {
                System.out.println("Not eligible");

            }



    }
}