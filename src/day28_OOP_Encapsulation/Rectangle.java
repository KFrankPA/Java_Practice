package day28_OOP_Encapsulation;

import day15_whileLoop.WhileLoopIntro;

public class Rectangle {

    private double width, length;

    public Rectangle(double width, double length) {
       setLength(length);
        setWidth(width);
    }

    public void setWidth(double width){
        if(width < 1){
            System.err.println("Invalid width size : " + width);
            System.exit(1);
        }
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        if(length < 1){
            System.err.println("Invalid length : " + length);
        }
        this.length = length;
    }
    public double getLength(){
        return length;
    }

    public double calcArea(){
        return length * width;
    }

    public double calcPerimeter(){
        return 2 * (length + width);
    }


    public String toString(){
        return "width = " + width + " " +
                "length = " + length + " " +
                "area = " + calcArea() + " " +
                "perimeter" + calcPerimeter();
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(0,6);
        System.out.println(rect1);
    }
}
/*
Create a class named Rectangle:
        Private variables:
            width, length

        Encapsulate all the fields
                Conditions:
                    width of the rectangle should not be negative
                    length of the rectangle should not be negative

        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcArea(): returns the area of rectangle
            calcPerimeter(): returns the perimeter of rectangle
            toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement
 */