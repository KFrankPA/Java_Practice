package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); // random order, accept null key

        System.out.println(hashMap);
        hashMap.put("Daniel", 115000);
        hashMap.put("Emily", 95000);
        hashMap.put("Jennifer", 85000);
        hashMap.put("Daniel", 55555);
        hashMap.put(null, 115000);
        hashMap.put("Ashley", null);
        hashMap.put("Marat", null);

      //  hashMap.put("Daniel", 77777);

        System.out.println("hashMap = " + hashMap);
        
        System.out.println("---------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // insertion order, accepts null key

        linkedHashMap.put("Daniel", 115000);
        linkedHashMap.put("Emily", 95000);
        linkedHashMap.put("Jennifer", 85000);
        linkedHashMap.put("Daniel", 20000);
        linkedHashMap.put(null, 115000);
        linkedHashMap.put("Ashley", null);
        linkedHashMap.put("Marat", null);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("---------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>(); // sorted order, does not accept null key


        treeMap.put("Daniel", 115000);
        treeMap.put("Emily", 95000);
        treeMap.put("Jennifer", 85000);
        treeMap.put("Daniel", 20000);
       // treeMap.put(null, 115000); // value can be null in TreeMap but key can not be null!
        treeMap.put("Ashley", null);
        treeMap.put("Marat", null);

        System.out.println("treeMap = " + treeMap);

        Map<String, Integer> hashTable = new Hashtable<>(); // random order, does not accept null key, Synchronized

        hashTable.put("Daniel", 115000);
        hashTable.put("Emily", 95000);
        hashTable.put("Jennifer", 85000);
        hashTable.put("Daniel", 175000);
        try {
            hashTable.put(null, 115000); // key and value can NOT be null
        }
        catch (RuntimeException e){
          e.printStackTrace();
            System.out.println("Done");
        }
      //  hashTable.put("Ashley", null); // value and key can NOT be null in Hashtable
       // hashTable.put("Marat", null);

        System.out.println("hashTable = " + hashTable);

    }
}
