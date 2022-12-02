package day04_concatenation;

public class Circle {

    public static void main(String[] args) {

        double radius = 5,
                Pi = 3.14,
                area = radius * radius * Pi;
         float perimeter = (float) ((float) + (radius * 2) * Pi);

        System.out.println("Area of the circle is " + area + "\n "
                + "Perimeter of the circle is " + perimeter );


    }


}
/*
 Create a class named Circle and declare the following variables:
                radius
                area
                perimeter

    6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5

            output:
                   Area of the circle is 78.5
                   Perimeter of the circle is 31.4
 */