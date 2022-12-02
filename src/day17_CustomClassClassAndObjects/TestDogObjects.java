package day17_CustomClassClassAndObjects;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Tiger";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Grey";

        dog1.eat();
        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.setInfo("Loki", "Huski", "Large", 'M', 3, "Brown"  );
        System.out.println(dog2);

dog2.eat();


    }
}
