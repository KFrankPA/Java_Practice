package day34_Absrtaction_Continue.animal;

public class Dolphin extends Animal implements Swimmable{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin " + getName() + " eats fish");

    }

    @Override
    public void swim() {

    }
}