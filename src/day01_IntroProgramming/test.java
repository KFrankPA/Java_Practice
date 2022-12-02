package day01_IntroProgramming;

import utilities.StringUtilities;

public class test {
    public static void main(String[] args) {
        String word = "wooden spoon";
       String result =  StringUtilities.reverse(word);
        System.out.println(StringUtilities.reverse(word));
        System.out.println(result);
    }
}
