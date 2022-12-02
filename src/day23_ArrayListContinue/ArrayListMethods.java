package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        array[0] = 100;
        System.out.println(Arrays.toString(array));
        System.out.println("==============================");
        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Egg");
        groceriesList.add("Water");
        groceriesList.add("Tomatoes");
        groceriesList.add("Apples");

        System.out.println(groceriesList);

        groceriesList.set(0, "Sugar");
        System.out.println(groceriesList);

        groceriesList.add(2, "Chicken");
        System.out.println(groceriesList);
        System.out.println("=======================");

        boolean tf = groceriesList.remove("Water");
        System.out.println(groceriesList + " " +tf);
        System.out.println("=======================");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(Integer.valueOf(10));
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers.size());
        System.out.println(numbers);
        System.out.println("=====================");

        ArrayList<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Jeniffer");
        names.add("Dima");
        names.add("Hasan");
        names.add("Fatma");
        names.add("Maria");
        names.add("Fatma");
        System.out.println(names.indexOf("Maria"));
        System.out.println(names.lastIndexOf("Maria"));

        for (String each : names) {
            if(names.indexOf(each) == names.lastIndexOf(each)){
                System.out.print(each + " unique, ");
            }
        }
        System.out.println();
        boolean hasMaria = names.contains("Maria");
        System.out.println(hasMaria);
        System.out.println("====================");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);
        System.out.println(list1.equals(list2));
        System.out.println("=================");

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(10);
        l2.add(10);
        System.out.println(l1.equals(l2));
        System.out.println(l1==l2);






    }
}
