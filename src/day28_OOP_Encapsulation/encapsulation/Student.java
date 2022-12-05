package day28_OOP_Encapsulation.encapsulation;

public class Student {

    private int age;


    public int getAge() { // Read ONLY

        if (age == 0) {
            System.err.println("Age has not been set");
            System.exit(1);
        }

        return age;
    }

    public void setAge(int age) { //Write ONLY

        if (age < 1 || age > 100) {
            System.err.println("Invalid age: " + age); // if age is invalid
            //return;  //exiting the method
            System.exit(1); // program gets terminated
        }
        this.age = age;
    }


}
