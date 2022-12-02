package day07_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int number = 0;

        String result = "";


        if(number > 0){
            result = "positive";
        } else if (number < 0 ) {
            result = " negative";
        } else
            result = " equal to zero";


        System.out.println(result);


    }


}

/*
1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
Ex:
number = 20
output:
Positive

 */