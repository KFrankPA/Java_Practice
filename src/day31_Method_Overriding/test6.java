package day31_Method_Overriding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test6 {
    public static void main(String[] args) {

        List <String> str = new ArrayList<>();
        str.add("word1");
        str.addAll(Arrays.asList("word2", "word3", "word2"));
        System.out.println(str);


    }
}
