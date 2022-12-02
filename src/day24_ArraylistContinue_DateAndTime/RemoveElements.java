package day24_ArraylistContinue_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

      list.removeIf(p -> p < 4 );
        System.out.println(list);
        System.out.println("=======================");

        ArrayList <String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "Ruby", "C#", "Java"));
        names.removeIf(p -> p.startsWith("J"));
        System.out.println(names);

        System.out.println("===========================");


    }
}
/*
Write a program that can remove the elements that are less than 4, from an ArrayList of integer
            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};
            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */