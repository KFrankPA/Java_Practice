package day09_scanner;

import java.util.Scanner;

public class NextLine_MethodPractive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your school name: ");
        String school_name = input.nextLine();

        System.out.println("Enter your gender: ");
        String gender = input.next();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter your street name: ");

        input.nextLine();

        String streetName = input.nextLine();

input.close();


    }
}
