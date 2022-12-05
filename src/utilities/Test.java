package utilities;
import day27_AccessModifiers.AccessModifiers;
import day27_AccessModifiers.Data;

public class Test {
    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("---------------------------");

        System.out.println(AccessModifiers.publicData); // public is always accessible in different packages

        // System.out.println(AccessModifiers.protectedData); // protected NOT always accessible in different packages

       // System.out.println(AccessModifiers.defaltData); // default is not accessible in outside packages

       // System.out.println(AccessModifiers.privateData); // private is ONLY accessible within its class
    }

}