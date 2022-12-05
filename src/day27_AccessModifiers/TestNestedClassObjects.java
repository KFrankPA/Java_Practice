package day27_AccessModifiers;

public class TestNestedClassObjects {
    public static void main(String[] args) {

       Car obj1 = new Car();  // Car obj
       obj1.new CarEngine(); // CarEngine object
        Car.CarEngine ob2 = obj1.new CarEngine();

        new Car.StaticClassInner();
Car.StaticClassInner obj3 = new Car.StaticClassInner();
        System.out.println("==================================");




    }

}
