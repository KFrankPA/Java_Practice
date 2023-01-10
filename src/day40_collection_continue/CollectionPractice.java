package day40_collection_continue;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        Collection <Integer> collection = new ArrayList<>();
        collection.add(200);
        collection.addAll(Arrays.asList(10,20,30,40,50,60,70,800,9000));

        System.out.println(collection);

        System.out.println( ((ArrayList)collection).get(1));

        System.out.println("=-------------------------------------=");

        Collection <Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100,200,300,400,500,600,100,100,100,200,200,300,500));

        System.out.println(collection2);

        System.out.println(new TreeSet<>(collection2) + " Tree set"); // sorting in ascending order
       // System.out.println( ((ArrayList)collection2).get(1)); // ClassCastException, cause there is no IS relationship between ArrayList and HashSet
        System.out.println(new ArrayList<>(collection2).get(2));

        List <Integer> l = new ArrayList<>(collection2); // assigning HashSet collection2 to ArrayList


    }
}
