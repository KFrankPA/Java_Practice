package day30_OOP_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Employee extends Person {

    private String jobTitile, employeeId;
    private double salary;

    public Employee(String name, char gender, LocalDate DOB, String jobTitile, String employeeId, double salary) {
        super(name, gender, DOB);
        setJobTitile(jobTitile);
        setEmployeeId(employeeId);
        setSalary(salary);
    }

    public String getJobTitile() {
        return jobTitile;
    }

    public void setJobTitile(String jobTitile) {
        this.jobTitile = jobTitile;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }
}
