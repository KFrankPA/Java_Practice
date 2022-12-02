package day26_Constructors_Continue_Statics.StudentTask;

import day26_Constructors_Continue_Statics.Circle;

public class TestCircleObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5.1);


        System.out.println(circle1);
        System.out.println(circle2);

       // System.out.println(circle1.pi);
       // System.out.println(circle2.pi);

        System.out.println(Circle.pi);


    }
}
