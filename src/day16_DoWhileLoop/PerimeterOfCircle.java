package day16_DoWhileLoop;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the radius of the circle:");
            double rad = sc.nextDouble();

            while (!(rad > 0)) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.out.println("Enter the radius of the circle:");
                rad = sc.nextDouble();
            }
            double deam = rad * 2;
            double circle = rad * rad * 2;
            double perim = deam * 3.14;
            System.out.println("Diameter of circle= " + deam );
            System.out.println("Area of circle = " + circle);
            System.out.println("Perimeter of circle = " + perim);

            System.out.println("Would you like to calculate another circle?");
            String answer = sc.next().toLowerCase();
            while( !(( answer.equals("yes")) || (answer.equals("no")) )) {
                System.err.println("invalid entry");
                System.out.println("Would you like to calculate another circle?");
                answer = sc.next().toLowerCase();
            }
                while(!(answer.equals("yes"))){
                    System.out.println("Thank you for using Cydeo Circle Calculator APP");
                    System.exit(1);
                }
            sc.close();
        }

    }
}
/*
Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message
                                "Invalid Entry for the radius of the circle"
                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle
                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program


 */