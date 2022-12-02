package day24_ArraylistContinue_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames {
    public static void main(String[] args) {

        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.addAll(Arrays.asList("Australia", "Canada", "Bosnia and Herzegovina", "Spain",
                "Argentina", "Malta", "United States of America", "Italy"));

        countryNames.removeIf(p -> p.length() >= 10);
        System.out.println(countryNames);

    }
}
/*
   Create an ArrayList of string called country names,
   write a program that can remove all the country names that have length of 10 or greater
 */