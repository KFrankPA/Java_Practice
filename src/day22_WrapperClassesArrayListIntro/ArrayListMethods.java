package day22_WrapperClassesArrayListIntro;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); //0
        list.add(20); //1
        list.add(30); //2

        list.add(1,5); // adds 5 to index 1, and previous number from index 1 will be shifted to right
        System.out.println(list);

        System.out.println("===================================");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Ali");
        studentList.add("Mike");
        studentList.add("Lena");
        studentList.add("Shoira");
        studentList.add(1, "Jimmy");

        System.out.println(studentList.size());
        System.out.println(studentList);
        System.out.println(studentList.get(0));
        String newList = studentList.get(2);
        System.out.println(newList);

        String lastStudent = studentList.get( studentList.size() -1 );
        System.out.println(lastStudent);



    }
}
