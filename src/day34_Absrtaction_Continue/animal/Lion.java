package day34_Absrtaction_Continue.animal;

public class Lion extends Animal implements WildAnimal{

    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " eats buffalo" );
    }

    @Override
    public void hunt() {

    }
}
