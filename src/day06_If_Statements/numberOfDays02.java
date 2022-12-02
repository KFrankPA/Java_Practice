package day06_If_Statements;

public class numberOfDays02 {
    public static void main(String[] args) {
        int n = 6;
        boolean has28Days = n == 2;
        boolean has30Days = n == 4 || n == 6 || n == 9 || n == 11;
        boolean has31Days = n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n ==10 || n==12;
        String month = "";
        if(has28Days){
            month = " has 28 Days";
        }
        if(has30Days){
            month = " Has 30 Days";
        }
        if(has31Days){
            month = " Has 31 Days";
        }
        System.out.println(month);
    }
}
/*
*
1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month

Ex:
Given:
number = 1

output:
31 days

Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
 */
