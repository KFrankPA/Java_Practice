package day31_Method_Overriding.animal_methodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Emily", "Bangle", 'F', 4, "Small", "Grey");

        Dog dog1 = new Dog("Barsik", "Husky", 'M', 3, "Large", "White");

        Lion lion1 = new Lion("Simba", "African Lion", 'M', 5, "Large", "Yellow" , true);

        Eagle eagle1 = new Eagle("Bella", "American Eagle", 'F', 2, "Medium", "Black and white");

        System.out.println(cat1);
        System.out.println(dog1);
        System.out.println(lion1);
        System.out.println(eagle1);

        System.out.println("=====================================");

        cat1.eat();
        dog1.eat();
        lion1.eat();
        eagle1.eat();

        System.out.println("====================================");

        cat1.sleep();
       dog1.sleep();
       lion1.sleep();
       eagle1.sleep();


    }

}
