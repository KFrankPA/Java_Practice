package day24_ArraylistContinue_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "Python", "Ruby", "C#", "Java", "Java", "Python", "Ruby", "C#", "Java"));
  Collections.replaceAll(list, "Java", "Chuva");
        System.out.println(list);

        System.out.println("=================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8, 1, 2, 3, 4, 5, 6, 7, 7, 8, 8));
        System.out.println(Collections.frequency(list2, 7));

        System.out.println("===================");
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed", "John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));
        int john = Collections.frequency(names, "John");
        System.out.println("John = " + john);
        System.out.println("===============================");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8, 1, 9));

        for (Integer each : numbers) {
           if(Collections.frequency(numbers, each) == 1){
               System.out.println(each);
           }
        }
    }
}
