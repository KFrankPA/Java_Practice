package day07_IfStatements;

public class MonthName {
    public static void main(String[] args) {

        int number = 13;
        String result = "";

        if (number > 0 && number < 13) {

            if (number == 1) {
                result = " January";
            } else if (number == 2) {
                result = " February";
            } else if (number == 3) {
                result = " March";
            } else if (number == 4) {
                result = " April";
            } else if (number == 5) {
                result = " May";
            } else if (number == 6) {
                result = " Junes";
            } else if (number == 7) {
                result = " July";
            } else if (number == 8) {
                result = " August";
            } else if (number == 9) {
                result = " September";
            } else if (number == 10) {
                result = " October";
            } else if (number == 11) {
                result = " November";
            } else {
                result = " December";
            }
        } else {
            result = " Invalid month";
        }
        System.out.println(result);

    }
}


/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents.
Ex:
Given:
number = 10
output:
October
Note: Assume that the given number is between 1 ~ 12

 */