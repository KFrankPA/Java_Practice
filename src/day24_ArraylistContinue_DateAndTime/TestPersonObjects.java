package day24_ArraylistContinue_DateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Muhtar", 'M', LocalDate.of(1989,02,25));
        people[1].setInfo("Julia", 'F', LocalDate.of(2002,07,20));
        people[2].setInfo("Irina", 'F', LocalDate.of(2000,06,9));
        people[3].setInfo("Aisha", 'F', LocalDate.of(1965,05,10));
        people[4].setInfo("Marie", 'F', LocalDate.of(1957,03,5));

        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));
        System.out.println(studentList);
        for (int i = 0; i < studentList.size(); i++) {
            studentList.removeIf(p -> p.age > 50);
            System.out.println(studentList.get(i).name  + studentList.get(i).age );

        }



    }
}
