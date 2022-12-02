package day13_CustomMethods;

import java.util.Scanner;

public class ReturnStatementsPractice {
    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);

         boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';
         if(!isValid){
             System.err.println("Invalid grade");
             return; // terminates the main method

        }
        System.out.println( (grade == 'A')? "Exellent" : (grade == 'B')? "Great jon" :
                (grade == 'C')? "Good" : (grade == 'D')? "Passed" : "Failed");


    }
}
