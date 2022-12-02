package day04_concatenation;

public class swapTwoVariables2 {

    public static void main(String[] args) {

        int x = 10,
                y = 15;

        System.out.println("x = " + x);

        System.out.println("y = " + y);

        x += y/3 ; // first y=15 / 15/3 = 5 then add to x = 10 => 15
        y += x/3;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }

}
/*
Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 20

 */