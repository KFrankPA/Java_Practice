package day35_Polymorphism;

import day34_Absrtaction_Continue.animal.*;
import day34_Absrtaction_Continue.car.Audi;
import day34_Absrtaction_Continue.car.Honda;
import day34_Absrtaction_Continue.car.Tesla;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {

       Dog dog =  new Dog("Barsik", "Husky", 'M', 4, "Small", "Color");

        Cat cat = new Cat("Emily", "Bangle", 'F', 4, "Small", "Grey");

        Tiger tiger = new Tiger("Sher", "African Tiger", 'M', 2, "Medium", "Yellow and white");

        Eagle eagle = new Eagle("Bella", "American Eagle", 'F', 2, "Medium", "Black and white");

        Lion lion = new Lion("Simba", "African Lion", 'M', 5, "Large", "Yellow");

        Animal[] animals = {dog, cat, tiger, eagle, lion}; // must be relationship between objects, to be Polymorphism

        Animal animal = new Dog("Barsik", "Husky", 'M', 4, "Small", "Color");

        animal.sleep();
       // animal.bark
        animal.eat();
        animal.drink();

        System.out.println("==========================================");


        Honda honda1 = new Honda("Pilot", "White", 2022, 35000);
        Audi audi1 = new Audi("Q6", "Silver", 2021, 29000);
        Tesla tesla1 = new Tesla("Model Y", "Blue", 2022, 55000);

        int a = 100;
        String str = "Hello";
        double num = 10.50;
        boolean tF = true;

        Object[] objects = {a, str, num, tF, honda1,audi1, tesla1};
        System.out.println(Arrays.toString(objects));











    }

}
