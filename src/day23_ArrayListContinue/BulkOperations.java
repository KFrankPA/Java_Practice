package day23_ArrayListContinue;

import day19_Arrays.ArraysLiterals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1, numbers);
        System.out.println(list1);
        System.out.println("===============");
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(75, 25, 35, 45, 95, 85));
        System.out.println(scores);

        System.out.println("==============");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Hasan", "Ramil", "Jeniffer", "Michelle"));
        System.out.println(names);
        names.addAll(2, Arrays.asList("Frank", "Nissan", "Altima"));
        System.out.println(names);

        System.out.println("==================");

        Integer[] nums = {10, 20, 30, 40, 50, 60};
        ArrayList<Integer> l1 = new ArrayList<>(); // new ArrayList<>(Arrays.asList(nums));
        l1.addAll(Arrays.asList(nums));
        System.out.println(l1);
        System.out.println("====================");
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Alena", "Lena", "Alex", "Mria"));
        System.out.println(employeeList);
        System.out.println(employeeList.contains("Alena"));

        boolean hasAlena = employeeList.contains("Alena");
        System.out.println("hasAlena = " + hasAlena);

        boolean hasALenaMria = employeeList.containsAll(Arrays.asList("Alena", "Mria"));
        System.out.println("hasALenaMria " + hasALenaMria);

        boolean hasAlenaLenaMria = employeeList.containsAll(Arrays.asList("Mria", "Lena", "Alena"));
        System.out.println("hasAlenaLenaMria = " + hasAlenaLenaMria);

        System.out.println("=======================");
        ArrayList<Integer> numList = new ArrayList<>();
        numList.addAll(Arrays.asList(10, 10, 20, 20, 30, 40, 50, 10, 20, 20, 10, 90, 100));
        numList.removeAll(Arrays.asList(10, 20));
        System.out.println(numList);

        System.out.println("==========================");
        ArrayList<String> devs = new ArrayList<>();
        devs.addAll(Arrays.asList("Hasan", "Ramil", "Frank", "Nissan", "Altima", "Jeniffer", "Michelle"));
        devs.retainAll(Arrays.asList("Frank", "Nissan"));
        System.out.println(devs);

        System.out.println("========================");
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(
                Arrays.asList("Potato", "Tomato", "Salt", "Green Peppers", "Ketchup", "Cheese", "Eggs", "Milk", "Oatmeal"));
        groceryList.retainAll(Arrays.asList("Oatmeal", "Milk", "Eggs"));
        System.out.println(groceryList);


    }
}
