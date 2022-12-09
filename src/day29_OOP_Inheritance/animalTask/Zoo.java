package day29_OOP_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Dollar", "Husky", 'M', 4, "Large", "White");

        Cat cat1 = new Cat();
        cat1.setInfo("Feicia", "stray", 'F', 4, "Medium", "Black and white");

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");

        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(tiger1);

        System.out.println("=======================================");

        dog1.eat();
        dog1.drink();
        dog1.sleep();

        cat1.eat();
        cat1.drink();
        cat1.sleep();

        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();


        System.out.println("=================");

        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        dog1.setName("Vasya");
        System.out.println(dog1.getName());



    }
}
