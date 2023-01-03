package day38_Exception_handling;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age < 0 || age >= 150) {
            if (age < 0) {
                throw new InputMismatchException("Age of person should not be negative");
            } else {
                throw new InputMismatchException("Age of person can not be greater than 150 :" + age);
            }
        }
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        try{
            throw new FileNotFoundException("");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
