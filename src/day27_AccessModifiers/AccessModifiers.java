package day27_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 200;

    protected static int protectedData = 300;

    static int defaultData = 400; // default is given by default

    private static int privateData = 500;


    public static void main(String[] args) {

        System.out.println(publicData); // accessible within same class
        System.out.println(protectedData); // accessible within same class
        System.out.println(defaultData); // default is accessible within same class

    }



}
