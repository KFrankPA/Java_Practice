package day42_MAPs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAP_methods {

    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>(); // random order, accepts null key and null values

        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");

        System.out.println(map);

        System.out.println("-----------------------------------");


        Map<String, String> employees = new TreeMap<>();

        employees.putAll(map);
        System.out.println(employees);

        System.out.println(map.equals(employees));



    }
}