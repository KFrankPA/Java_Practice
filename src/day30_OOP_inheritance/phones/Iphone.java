package day30_OOP_inheritance.phones;

public class Iphone extends Phone {

    public Iphone(String model, String size, String color, double price){
        super("Apple", model, size, color, price);
    }

    public static boolean hasApplePay = true;

    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " is face timing " + phoneNumber );
    }

    public void faceTime(String email){
        System.out.println(getModel() + " is face timing " + email);

    }

}
