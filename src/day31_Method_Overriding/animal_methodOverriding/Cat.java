package day31_Method_Overriding.animal_methodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }



    public void sleep() {
        System.out.println("Cat " + getName() + " sleeps 12 hours in a day");
    }


    public void eat() {
        System.out.println("Cat " + getName() + " eats cat food");
    }

    public void scratch(){
        System.out.println("Cat " + getName() + " is scratching");

    }
}
