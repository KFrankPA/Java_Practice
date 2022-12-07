package day28_OOP_Encapsulation.candy;

public class TestCandy {

    public static void main(String[] args) {

        Candy candy1 = new Candy("MMS", 10, 0, true);
        Candy candy2 = new Candy("Mars", 15, 2.99, false);

         System.out.println(candy1);
        System.out.println(candy2);

        CandyFactory factory1 = new CandyFactory("Hershey");
        CandyFactory factory2 = new CandyFactory("Hershey");
        factory1.addCandy(candy1);
        factory1.addCandy(candy2);

     Candy[] can1 = {candy1, candy2};
     factory1.addCandies(can1);

    factory2.addCandies(can1);


       // System.out.println(factory1);

    }

}
