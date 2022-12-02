package day16_DoWhileLoop;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        while(true){
            System.out.println("Enter side of square");
            double side = sc.nextDouble();
            while(!(side > 0)){
                System.err.println("Invalid Entry for the side of the square");
                System.out.println("Enter the side of the square:");
                side = sc.nextDouble();
            }
            double area = side * side;
            double perim = side * 4;
            System.out.println("Area of square = " + area);
            System.out.println("Perimeter of square = " + perim);

            System.out.println("Would you like to calculate another Square?");
            String answer = sc.next().toLowerCase();
            while(!((answer.equals("no")) ||(answer.equals("yes") ))) {
                System.out.println("Invalid entry, please answer Yes/No");
                answer = sc.next().toLowerCase();

            } while(!(answer.equals("yes"))){
                System.out.println("Thank you, bye");
                    System.exit(1);
                }
            }
        }

    }

/*
Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message
                                "Invalid Entry for the side of the square"
                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square
                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"
                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
                        Hint: you can use  System.exit(1) to terminate the entire program

 */