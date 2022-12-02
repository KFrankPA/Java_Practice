package day09_scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of shares you have already");
        int numOfShares = input.nextInt();

        if (numOfShares > 0) {
            System.out.println("Enter your total value in the stock market");
            double totalValue = input.nextDouble();
            input.nextLine();

            System.out.println("Name of the company you have the most shares in");
            String nameOfShares = input.nextLine();

            System.out.println("You total stock market holding is " + totalValue + " which is made up of "
                    + numOfShares+ " of shares. " + nameOfShares + " is your company holding");
        } else {
            System.out.println("You entered invalid share quantity");
        }
input.close();

    }
}
/*
 Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

 */