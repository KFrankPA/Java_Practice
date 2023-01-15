package day42_MAPs;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str = "bbcccaaaaa";

        Map<Character, Integer> ltr = new LinkedHashMap<>();

        for (String each : str.split("")) {

            int frq = Collections.frequency(Arrays.asList(str.split("")), each);

            ltr.put(each.charAt(0), frq);

        }
        System.out.println(ltr);


        // String str2 = "bbcbbbttttttccaaaaa";
        // System.out.println(Collections.frequency(Arrays.asList(str2.split("")), "c"));

    }
}

/*
1. Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}

 */