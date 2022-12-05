package day27_AccessModifiers;

public class CydeoStudents {

    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;

    public static String schoolName, programmingLanguage, fieldOfStudy, secretCode;

    public CydeoStudents(String name, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }


    static {
        schoolName = "CYDEO";
        programmingLanguage = "Java";
        fieldOfStudy = "QA - SDET";
        secretCode = "Wooden spoon";
    }

    public void printSchoolName() {
        System.out.println(schoolName);
    }

    public void printSecretCode() {
        System.out.println(secretCode);
    }

    public void attendClass() {
        System.out.println(name + "  attends " + programmingLanguage + " at " + schoolName);
    }
public void study(){
    System.out.println(name + " studies at " + schoolName + " in Batch " + batchNumber );
}

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }

    public static void main(String[] args) {

        CydeoStudents student1 = new CydeoStudents("Alexia", 'F', 29, 28, 15 );
        System.out.println(student1);
       student1.printSecretCode();
    }
}
/*
create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()

 */