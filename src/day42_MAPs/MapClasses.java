package day42_MAPs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>(); // maintains insertion order, accepts null key and null value

        map.put("C02", 79000);
        map.put("B03", 85000);
        map.put("A02", 95000);
        map.put("D02", 77777);
        map.put("A03", 97000);
        map.put("A04", 101111);
        map.put("A05", 120000);

        // iterating the map by the keys
        for (String eachKey : map.keySet()) {
            map.replace(eachKey, map.get(eachKey) * 2);
            System.out.println(eachKey);
        }
        System.out.println(map);

        System.out.println("-------------------------------");
                // printing keys only
        for (String eachKey : map.keySet()) {
            System.out.println(eachKey);

        }

        System.out.println("_____________________________________");

        // iterating map by values
        for (Integer eachValue : map.values()) {

            System.out.println(eachValue);

        }
        System.out.println("-------------");

        //Iterating by the entries
        System.out.println("getKey");
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            System.out.println(eachEntry.getKey());
           // System.out.println(eachEntry);
        }
        System.out.println("_____________________");

        System.out.println("getValue");
      //  int a = 0;
        for (Map.Entry<String, Integer> eachEntrySet : map.entrySet()) {
          System.out.println(eachEntrySet.getValue()); // and we can assign them to Integer or int

          //  a = eachEntrySet.getValue();

        }
       // System.out.println(a + " hey");

        for (Map.Entry<String, Integer> each2 : map.entrySet()) {

            each2.setValue( (each2.getValue() > 200000)? 7575 : each2.getValue());
            System.out.println(each2.getValue());
        }






    }
}
