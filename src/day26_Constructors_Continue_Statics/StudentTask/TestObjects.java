package day26_Constructors_Continue_Statics.StudentTask;

public class TestObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A26");
        Student student2 = new Student("Maryam", 25, 'F', "A36");
        Student student3 = new Student("Ali", 27, 'M', "A56");
        Student student4 = new Student("Ira", 31, 'F', "A12");
        Student student5 = new Student("Farid", 41, 'M', "A19");

        Student[] studentYoy = { student1, student2, student3, student4, student5};

        StudentGroup group1 = new StudentGroup("JaVA Turtles", 1);

       group1.addStudents(studentYoy);
        System.out.println(group1);

        group1.removeStudent("A26");
        System.out.println(group1);
        System.out.println("=======================");
        for(Student each : group1.students){
            System.out.println(each.name + " : "  + each.age + ", " + each.gender);
        }

    }
}
