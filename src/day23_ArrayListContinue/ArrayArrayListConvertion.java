package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConvertion {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C", "D", "E"};
        ArrayList <String> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr1));
        System.out.println(list);


        System.out.println("=======================");
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "Python", "C#"));
        String[] languages = list2.toArray(new String[list2.size()]); // new String[0]
        System.out.println("languages = " + Arrays.toString(languages));
         //(new String[list2.size()])



    }
}
