package day27_AccessModifiers;

public class TestCydeoStudentObjects {
    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);

        CydeoStudent student1 = new CydeoStudent("Ashley", 27, 'F');
        CydeoStudent student3 = new CydeoStudent("Ashley", 27, 'F');
        CydeoStudent student2 = new CydeoStudent("Amy", 29, 'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);

    }
}
