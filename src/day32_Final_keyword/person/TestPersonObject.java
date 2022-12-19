package day32_Final_keyword.person;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person = new Person("Daniel",'M', LocalDate.of(1990,2,12));

        System.out.println(person);

        System.out.println("=================---------------===============");

        Employee employee = new Employee("Dan",'M', LocalDate.of(1980,9,12),"Chief", 89000 );

        System.out.println(employee);

        employee.work();



    }
}
