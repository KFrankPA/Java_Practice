package day09_scanner;
import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles: ");
        int miles = input.nextInt();

        double milesToKm=miles * 1.609;


        System.out.println(miles + " Miles equal to " + milesToKm + " kilometers ");

input.close();

    }
}
/*
 Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers


 */