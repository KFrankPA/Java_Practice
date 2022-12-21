package day33_Abstraction.employeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        // Employee employee1 = new Employee("John", 54, 'M', "A5", "SDET", 78000);
        // we can not create objects from an abstract class, Object must be created from a concrete class

        Teacher teacher1 = new Teacher("John", 54, 'M', "A5",  98000);

        Developer dev1 = new Developer("Alexia", 24, 'F', "Java Developer",145000,"Java" );

        Driver driver = new Driver("John", 29, 'M', "Truck Driver", 175000);

        System.out.println(teacher1);
        System.out.println(dev1);
        System.out.println(driver);


    }
}
