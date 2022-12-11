package day30_OOP_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Lucy", 'F', LocalDate.of(1997,10,15), 'A',"B-1250");

        President president1 = new President("Dan", 'M', LocalDate.of(1980,02,25), LocalDate.of(2010, 07,8));

        Employee employee1 = new Employee("Charlie", 'F', LocalDate.of(2000, 6, 7), "Manager", "LK=96", 79000);

        System.out.println(student1);
        System.out.println(president1);
        System.out.println(employee1);

        student1.eat("Shurpa");
        president1.drink("Gatorade");
        employee1.eat("Mashed potatoes");






    }

}
