package day26_Constructors_Continue_Statics;

public class CydeoStudent {
   public String name;
   public int age;
   public char gender;
   public String id;
   public int grade;
   public int batchNumber;
   public int groupNumber;
   public static String progLanguage = "Java";
   public static String schoolName = "Cydeo";
   public static String magicWord = "Please";

   public void Study(){
       System.out.println(this.name + " stadying" );
       System.out.println(this.name + " attends " + this.grade + " class");
   }
   public static void printSchoolName(){
       System.out.println(schoolName);
   }

    public CydeoStudent(String name, int age, char gender, String id, int grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public static void printProgLanguage(){
       System.out.println("Programming language " + progLanguage);


   }

}
