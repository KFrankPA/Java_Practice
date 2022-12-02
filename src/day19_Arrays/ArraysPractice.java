package day19_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        String[] students = new String[5];

        students [0] = "Mike";
        students [students.length-1] = "Ashley";
        students [2] = "Sumeye";
        students [1] = "Abdullah";
        students [3] = "Muhtar";

        System.out.println(Arrays.toString(students));

        students[0] = "Kuzzat";
        System.out.println(Arrays.toString(students));


        for (int i = students.length-1; i >= 0; i--) {
            System.out.println(students[i]);

        }
        System.out.println("==========================");

        for (int i = 0; i < students.length; i++) {

        }
        for (int i = students.length - 1; i >= 0; i--) {
            
        }
        System.out.println("===============================");






        }

    
}
