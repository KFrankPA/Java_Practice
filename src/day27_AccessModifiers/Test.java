package day27_AccessModifiers;

public class Test {
    public static void main(String[] args) {

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("===========================");

        System.out.println(AccessModifiers.publicData); // accessible within same package

        System.out.println(AccessModifiers.protectedData); // accessible within same package

        System.out.println(AccessModifiers.defaultData); // default is accessible within same package

        // System.out.println(AccessModifiers.privateDate); // private is not accessible within same package

    }
}