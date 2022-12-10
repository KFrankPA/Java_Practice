package day29_OOP_Inheritance.employee;

public class TestEmployee {
    public static void main(String[] args) {

       Driver driver1 = new Driver();
       driver1.setInfo("John", 'M', 35, "md - 157", "Driver O/O", 145000);

       Developer dev1 = new Developer();
       dev1.setInfo("Alexia", 'F', 27, "HK-23", "Developer", 175000, "Java");

        System.out.println(dev1);
        System.out.println(driver1);

    }


}
