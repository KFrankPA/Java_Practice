package oca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Shop {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        if(sb.toString().equals(s.toString())){
            System.out.println("Match 1");
        } else if (sb.equals(s)) {
            System.out.println("M 2");
        }else {
            System.out.println("NO MATCH");
        }

        System.out.println(sb.toString());
        System.out.println(s.toString());
        System.out.println(s.equals(sb));

        LocalDate date = LocalDate.of(2012, 01, 32);
        date.plusDays(10);
    }
}
