package day25_Constructors;

import java.time.LocalDate;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee("Frank", 34, 'M', "Qa Engineer", 135000, LocalDate.of(2022, 3, 10));
        System.out.println(e1);
    }
}
