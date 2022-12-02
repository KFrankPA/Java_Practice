package day27_AccessModifiers;

public class CydeoStudent {
     public String name;
     public int age;
     public char gender;

     public static String schoolName;
     public static String secretcode;

     public CydeoStudent (String name, int age, char gender){
         this.name = name;
         this.age = age;
         this.gender = gender;
     }

     static{
         schoolName = "Cydeo School";
         secretcode = "Wooden Spoon";
     }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
