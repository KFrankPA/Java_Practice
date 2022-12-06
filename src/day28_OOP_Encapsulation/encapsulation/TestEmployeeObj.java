package day28_OOP_Encapsulation.encapsulation;

public class TestEmployeeObj {

    public static void main(String[] args) {
/*
        Employee obj1 = new Employee();

        obj1.setName("      ");
        System.out.println(obj1.getName());

        obj1.setAge(36);
        System.out.println(obj1.getName());

        obj1.setJobTitle("QA Engineer");
        System.out.println(obj1.getJobTitle());

        obj1.setSalary(250000);
        System.out.println(obj1.getSalary());
*/

        Employee employee1 = new Employee("Alexia", 30, "SDET", 175000);
        System.out.println(employee1);


    }
}
