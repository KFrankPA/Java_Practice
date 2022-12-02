package day04_concatenation;

public class CarInfo {

    public static void main(String[] args) {

        String make = "Toyota",
                model = "Camry",
                color = "Red";

        int year = 2018,
                miles = 50000,
                price = 19000;


        System.out.println("Car infor information is :\n\t" + make + " " + model + ", "+
                miles + " " + "miles, " + color +", $" + price + ".");
    }

}
/*
1. Create a class named CarInfo.java
2. Declare the following variables:
1. year
2. make
3. model
4. miles
5. color
6. Price
3. Use concatenation to print the full info of the car in the
following format:
Year Make Model, Miles, Color, Price.
Ex:
Car information is :
2018 Toyota Camry, 50000 miles, Red, $19000.

 */