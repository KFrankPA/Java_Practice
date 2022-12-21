package day34_Absrtaction_Continue.animal;

public class Shark extends Animal implements WildAnimal, Swimmable{


    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Shark " + getName() + " eats fish");
    }

    @Override
    public void hunt() {

    }

    @Override
    public void swim() {

    }
}
