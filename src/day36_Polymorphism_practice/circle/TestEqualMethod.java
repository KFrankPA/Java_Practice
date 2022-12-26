package day36_Polymorphism_practice.circle;

import day36_Polymorphism_practice.iPhone.IPhone;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(10);

        System.out.println(circle1.equals(circle2));

        System.out.println(circle1.equals(circle3));


        System.out.println("==============================");

        IPhone iphone1 = new IPhone("Apple", "IPhone14 PRO", "Medium", "Black", 1100);

        IPhone iphone2 = new IPhone("Apple", "IPhone14 PRO", "Medium", "White", 1100);

        System.out.println(iphone1.equals(iphone2));

    }
}
