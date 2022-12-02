package day12_CustomMethods;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        monthName(15);

    }
    public static void monthName (int number){

        String result = "";

        if (number >= 1 && number <= 12) {
            if (number == 1){
                result = "January";
            } else if (number == 2) {
                result = "February";

            } else if (number == 3) {
                result = "March";
            } else if (number == 4) {
                result = "April";
            } else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "June";
            } else if (number == 7) {
                result = "July";
            } else if (number == 8) {
                result = "August";
            } else if (number == 9) {
                result = "September";
            } else if (number == 10) {
                result = "October";
            } else if (number == 11) {
                result = "November";
            } else {
                result = "December";
            }

        }else{
            result = "invalid month number";
        }
        System.out.println(result);

    }
}
/*
 Create a method named monthName that can display the name of the month based on the given number to the method,
 if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */