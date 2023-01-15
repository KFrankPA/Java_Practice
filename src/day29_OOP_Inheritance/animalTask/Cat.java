package day29_OOP_Inheritance.animalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender,age, size, color);
    }
    public void meow(){
        System.out.println(getName() + " is meowing");
    }

    public void scratch(){
        System.out.println(getName() + " is scratching");
    }


}
