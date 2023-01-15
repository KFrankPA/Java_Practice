package day42_MAPs;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {


        String str = "bbccdftcaaaaga";

        Map<Character, Integer> ltr = new LinkedHashMap<>();

        for (String each : str.split("")) {

            int frq = Collections.frequency(Arrays.asList(str.split("")), each);

            if (frq == 1) {
                ltr.put(each.charAt(0), frq);

            }
        }
            System.out.println(ltr);


    }
}