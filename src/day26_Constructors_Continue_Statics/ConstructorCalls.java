package day26_Constructors_Continue_Statics;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default constructor-*");
    }
    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }
    public ConstructorCalls(String c){
        this(2.5);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        method1();
        System.out.println("===============================");
        method2();
        System.out.println("==================");

       ConstructorCalls obj1 = new ConstructorCalls();

    }
    public static void method1(){
        System.out.println("Method 1");
    }
    public static void method2(){
        method1();
        System.out.println("Method 2");
    }

}
