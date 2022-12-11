package day30_OOP_inheritance.phones;

public class TestPhoneObjects {
    public static void main(String[] args) {


        Iphone iphone1 = new Iphone("14Pro", "Large", "White", 1199);

        Samsung samsung1 = new Samsung("Galaxy S22", "Medium", "White", 1100);

        Nokia nokia = new Nokia("Brick", "Small", "Pink", 50);

        iphone1.call(7178291856l);
        samsung1.call(2125689);
        nokia.call(212565898);

        System.out.println(iphone1);
        System.out.println(samsung1);
        System.out.println(nokia);

        iphone1.faceTime(7178291856L);
        samsung1.freeze();





    }

}
