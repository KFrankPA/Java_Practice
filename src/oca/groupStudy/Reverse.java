package oca.groupStudy;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {


  //  public static int sumOfNumber(String n){
        String s="22 some text 3 7";
        int sum =0;
        String[] strarr = s.split(" ");
        int summery = 0;

        System.out.println(Arrays.toString(strarr));
        String digitsStr ="";
        for (char each : s.toCharArray()) {
           // for (int i = 0; i < each.length(); i++) {
                if(Character.isDigit(each)){
                summery += Character.getNumericValue(each);
                }
           // }
        }
        System.out.println(summery);


     //   return 0;
    }




}
/*
Sum of all integers:
             return the sum of all integers found in the parameter String.
            You can assume that integers are separated from other parts with one or more spaces (' ' symbol).
            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
 */