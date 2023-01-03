package day38_Exception_handling;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
     setName(name);
     setAge(age);
     if(!(gender == 'M' || gender == 'F')){ // if the gender is invalid
         throw new RuntimeException("Invalid gender: " + gender); // throws the runtime exception and crashes the program
     }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        if(age == 0){
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0 || age > 150){ // if the given age is invalid
            throw new RuntimeException("Invalid age : " + age); // throws exception and crashes the program
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}