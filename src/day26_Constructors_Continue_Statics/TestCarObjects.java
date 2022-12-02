package day26_Constructors_Continue_Statics;

public class TestCarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Audi");
        System.out.println(car1);

        Car car2 = new Car("BMW", "X6");
        System.out.println(car2);

        Car car3 = new Car("Nissan", "Altima", 2019, 24900, "Silver");
        System.out.println(car3);


    }
}
