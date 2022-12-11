package day30_OOP_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee{

    public Teacher(String name, char gender, LocalDate DOB, String jobTitile, String employeeId, double salary) {
        super(name, gender, DOB, jobTitile, employeeId, salary);
    }

    public void teach(){

    }

}
