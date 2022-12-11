package day29_OOP_Inheritance.animalTask;

public class Tiger  extends Animal{ // Tiger is an animal

    public Tiger(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size, color);
    }
    public void hunt(){
        System.out.println(getName() + " is hunting");
    }

}
