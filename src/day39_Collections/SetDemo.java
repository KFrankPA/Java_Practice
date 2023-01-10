package day39_Collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>(); // accepts duplicates, keeps insertion order, has index

        list.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        list.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        list.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        list.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));

        System.out.println("====================================================");


        Set<Integer> set1 = new HashSet<>(); // order is random, accepts null key

        set1.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        set1.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        set1.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        set1.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        set1.addAll(Arrays.asList(null, null, null));

        System.out.println(set1);

        System.out.println("================================================");


        Set<Integer> set2 = new LinkedHashSet<>(); // keeps insertion order, accepts null key

        set2.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        set2.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        set2.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        set2.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        set2.addAll(Arrays.asList(null, null, null));

        System.out.println(set2);

        System.out.println("-----------------------------------");


        Set<Integer> set3 = new TreeSet<>(); // keeps ascending sorted order, and does not take duplicates

        set3.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        set3.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        set3.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        set3.addAll(Arrays.asList(10, 20, 30, 500, 750, 1000, 250));
        // set3.addAll(Arrays.asList(null, null, null));

        System.out.println(set3);

        System.out.println("-____________________________________________-");

        String[] words = {"Java", "Java", "Python", "Python", "C#", "C#", "C++", "Ruby"};

        LinkedHashSet<String> result = new LinkedHashSet<>();

        result.addAll(Arrays.asList(words));

        System.out.println(result);
        /*
        int count = 0;
        for (String each : result) {

            if (count == 1) {
                System.out.println(each);
            }

            count++;
        } */

        System.out.println(new ArrayList<>(result).get(1));

        words = result.toArray(new String[0]); // converting Set to Array

        System.out.println(words[1] + " second element"); // second element

        System.out.println(Arrays.toString(words) + " words to array");

        System.out.println("-------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 20, 20, 30, 30, 40, 50, 60, 60, 70, 80, 90, 80, 90, 1, 2, 3, 4, 5, 6, 10, 7));

 //SortedSet
        Set <Integer> n = new TreeSet<>(numbers); // List to Set
        System.out.println(n);

        System.out.println(new ArrayList<>(n).get(n.size()-1));




    }
}
