package day34_Absrtaction_Continue.animal;

public class Cat extends Animal implements Playable{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Car " + getName() + " eats catFood");
    }

    @Override
    public void play() {

    }
}
