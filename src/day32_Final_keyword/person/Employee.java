package day32_Final_keyword.person;

import java.time.LocalDate;

public class Employee extends Person{

    private String jobTitle;
    private double salary;

    public String getJobTitle() {
        return jobTitle;
    }

    public Employee(String name, char gender,  LocalDate dateOfBirth,  String jobTitle, double salary) {
        super(name, gender,  dateOfBirth);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

    @Override
    public String toString() {
        return super.toString().replace("}", "")  +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


}
