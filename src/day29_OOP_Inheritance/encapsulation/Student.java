package day29_OOP_Inheritance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);

    }

    public String getName() {

        if (name == null) {
            name = "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.err.println("Invalid student name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0) {
            System.err.println("Age can not be negative");
            System.exit(1);
        }
        if (age < 5 || age > 90) {
            System.err.println("Invalid student age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        boolean isValid = gender == 'F' || gender == 'M';
        if (isValid) {
            this.gender = gender;
        } else {
            System.err.println("Invalid gender");
            System.exit(1);
        }
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';
        if (isValid) {
            this.grade = grade;
        } else {
            System.err.println("Invalid grade" + grade);
            System.exit(1);
        }

    }

    public String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public String toString() {
        return "Inheritance_encapsulation{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +
                '}';
    }

}






