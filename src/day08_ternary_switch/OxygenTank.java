package day08_ternary_switch;

public class OxygenTank {

    public static void main(String[] args) {

        int number = 45;


        String message = (number >= 90)? "Your tank is full" : (number>= 80)? " Still okay" : (number >=70)? "Dont go too far"
                : (number >=60)? " Start to head back" : (number >= 50)? " Be careful now you are at 50%" : " Game over";
        System.out.println( message);





    }
}
/*
4. Create a class called OxygenTank. You are diving in the ocean.
 Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary

 */