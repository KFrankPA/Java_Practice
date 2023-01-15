package day42_MAPs;

import java.time.LocalDate;
import java.util.*;

public class MAP_practice2 {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'M');
        person2.put("age", 32);
        person2.put("job_title", "Developer");
        person2.put("salary", 100000.5);
        person2.put("hired_date", LocalDate.of(2021, 1, 15));
        person2.put("married", true);


        Map<String, Object> person3 = new LinkedHashMap<>();

        Map<String, Object> person4 = new LinkedHashMap<>();

        Map<String, Object> person5 = new LinkedHashMap<>();

        List<Map<String,  Object>> listOfMaps = new ArrayList<>();

        listOfMaps.add(person1);
        listOfMaps.add(person2);

        //
        System.out.println(listOfMaps);

        System.out.println("-------------------------");

        for(Map<String, Object> eachMap : listOfMaps){
            System.out.println(eachMap);
          /*for(Map.Entry<String, Object> eachEntry : eachMap.entrySet()){
               System.out.println(eachEntry);
           }*/
            for(String each : eachMap){

            }

        }
    }

}
