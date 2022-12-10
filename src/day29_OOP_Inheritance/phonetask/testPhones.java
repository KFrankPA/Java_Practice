package day29_OOP_Inheritance.phonetask;

public class testPhones {
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone();
        iphone1.setInfo("Apple", "14Pro Max", "white", 1399, 7);

        System.out.println(iphone1);

        Nokia nokia1 = new Nokia();
        nokia1.setInfo("Nokia", "3310", "Blue", -1, 7);
        System.out.println(nokia1);


    }
}
