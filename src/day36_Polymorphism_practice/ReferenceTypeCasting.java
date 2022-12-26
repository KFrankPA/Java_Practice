package day36_Polymorphism_practice;

import day29_OOP_Inheritance.animalTask.Animal;
import day29_OOP_Inheritance.animalTask.Cat;
import day29_OOP_Inheritance.animalTask.Dog;
import day30_OOP_inheritance.phones.IPhone;
import day30_OOP_inheritance.phones.Nokia;
import day30_OOP_inheritance.phones.Phone;
import day33_Abstraction.employeeTask.Developer;
import day33_Abstraction.employeeTask.Employee;
import day35_Polymorphism.transportationTask.AutoPilot;
import day35_Polymorphism.transportationTask.Electric;
import day35_Polymorphism.transportationTask.Tesla;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        Dog dog = new Dog("Dollar", "Husky", 'M', 4, "Large", "White");

        Animal animal = (Animal) new Dog("Dollar", "Husky", 'M', 4, "Large", "White");// implicit casting

        System.out.println("=============================");

        Animal animal1 = new Dog("Dollar", "Husky", 'M', 4, "Large", "White"); // Upcasting == > Polymorphism

        Animal animal2 = new Animal("Dollar", "Husky", 'M', 4, "Large", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();

        ((Dog) animal1).bark(); // down casting

        //  Dog dog1 = (Dog) animal1; //
        // dog1.bark();

        //  ((Cat)animal1).scratch(); // Dog can NOT be converted to Cat, because there s not "IS A" relationship between dog and cat

        System.out.println("========================================");

        Phone phone = new Nokia("14Pro", "Large", "White", 1199); // upcasting is polymorphism

        phone.call(800);
        phone.text(1800);


        ((Nokia) phone).selfDefence();

        // ((IPhone) phone).faceTime(8000);


        System.out.println("=======================");

        Employee employee = new Developer("Alexia", 24, 'F', "Java Developer", 145000, "Java");

        employee.work();

        Electric electric = new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);

        electric.charge();

      ((Tesla)electric).selfDrive();

       electric.selfDrive();

        ((AutoPilot)electric).selfDrive();

        (electric).autoPark();



    }
}
