package day26_Constructors_Continue_Statics;

import javax.swing.*;

public class Car {

    public String make, model;

    public int year;
    public double price;
    public String color;

    public Car(String make) { //1
        this.make = make;
    }

    public Car(String make, String model) { //2
        this(make);
        this.model = model;
    }

    public Car(String make, String model, int year) { //3
        this(make, model);
        this.year = year;
    }

    public Car(String make, String model, int year, double price) { //4
       this(make, model, year);
        this.price = price;
    }

    public Car(String make, String model, int year, double price, String color) { //5
       this(make, model, year, price);
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

}
