package day09_scanner;
import java.util.Scanner;
public class centsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of cents you have ");
        int cents = input.nextInt();

        int toDollar = cents/100;
        int toCents = cents%100;

        System.out.println(cents + " cents equal to: " + toDollar + " dollars and " +toCents+ " cents");

input.close();


    }
}
/*
. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */