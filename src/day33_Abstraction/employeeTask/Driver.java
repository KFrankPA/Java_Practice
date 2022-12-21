package day33_Abstraction.employeeTask;

public class Driver extends Employee {

    public Driver(String name, int age, char gender, String jobTitle, double salary) {
        super(name, age, gender, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving");

    }

}
