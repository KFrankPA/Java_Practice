package day37_Exceptions;

import day36_Polymorphism_practice.circle.Circle;

public class TestPizzaObjects {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S', 2,3);
        Pizza pizza2 = new Pizza('S', 2,3);

        System.out.println(pizza1.equals(pizza2));

        Object obj = new Pizza('S', 2 ,3 );

        boolean r = obj.equals(pizza2);

        System.out.println(r);

        double total = ((Pizza)obj).calcCost();

        System.out.println(total);

      //  double area = ((Circle)obj).area();

       // System.out.println(area);





    }
}
