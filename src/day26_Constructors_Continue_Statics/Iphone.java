package day26_Constructors_Continue_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public String color;

    public double price;

    public static String OS = "IOS";

    public static String madeIn = "Made in China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public void printPhoneInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public static void printOSInfo(){
        System.out.println("OS: " + OS);
    }

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }


}




// attributes brand, model,color, price, OS, madeIn