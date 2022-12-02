package day06_If_Statements;

public class PosNegZero {


    public static void main(String[] args) {

        int num = 20;

        if (num == 0) {
            System.out.println(num + " is Zero");
        }
        if (num > 0) {
            System.out.println(num + " positive");
        }
        if (num < 0) {
            System.out.println(num + " is negative");

        }
        System.out.println("===========================");
        boolean pos = num > 0;
        boolean neg = num < 0;
        boolean isZero = !neg && !pos;

        System.out.println(pos + " is positive");
        System.out.println(neg + " is negative");
        System.out.println(isZero + " is  Zero");

        System.out.println(10 > 9 == 15 < 5 && "Java" != "Python" || 'a' == 'A');
         //                   t  ==   true &&   true !=    true  || 'a' == 'A'

         //                          true     &&        true        ||  'a' == 'A'
    //                                       true



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