package day42_MAPs;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MAP_practice5 {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);

        person1.forEach((k, v) -> { System.out.println(k + " : " + v); } );


    }
}
