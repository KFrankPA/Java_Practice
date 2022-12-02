package day07_IfStatements;

public class WeekDays {
    public static void main(String[] args) {

        int number = -70;
        String result = "";
                // WITHOUT CURLY BRACES
        if(number >=1 && number <=7){

            if(number == 1) result = " Monday";

            else if(number == 2) result = " Tuesday";

            else if(number == 3) result = " Wednesday";

            else if(number == 4) result = " Thursday";

            else if(number == 5) result = " Friday";

            else if(number == 6) result = " Saturday";

                        else result = " Sunday";
            }else{
            result = " invalid number";
        }

        System.out.println(result);


    }
}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents.
Ex:
Given:
number = 1
output:
Monday
Note: Assume that the given number is between 1 ~ 7

 */