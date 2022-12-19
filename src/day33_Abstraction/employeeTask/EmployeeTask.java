package day33_Abstraction.employeeTask;

import java.time.LocalDate;

public abstract class EmployeeTask {
    private String name;
    private int age;
    private char gender;
    private String jobTitle;
    private double salary;


    public EmployeeTask(String name, int age, char gender, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getJobTitle() {
        return jobTitle;
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

public abstract void work();




}
