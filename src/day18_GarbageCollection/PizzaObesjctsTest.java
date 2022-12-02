package day18_GarbageCollection;

public class PizzaObesjctsTest {

    public static void main(String[] args) {

        PizzaObjects pizza1 = new PizzaObjects();
        pizza1.size = 'm';

        PizzaObjects pizza2 = new PizzaObjects();
        pizza2.size = 'm';
        pizza1.setInfo('l', 1, 2);
        System.out.println(pizza1);
        System.out.println(pizza2);

        double totalCost = 0;
        for (int i = 0; i < 8; i++) {

            PizzaObjects small = new PizzaObjects();
            small.setInfo('s', 1, 0);
            totalCost += small.calcCost();

            PizzaObjects medium = new PizzaObjects();
            medium.setInfo('m', 1, 0);
            totalCost += medium.calcCost();

            PizzaObjects large = new PizzaObjects();
            large.setInfo('l', 1, 2);
            totalCost += large.calcCost();

        }
        System.out.println("total = " + totalCost);
    }

}
