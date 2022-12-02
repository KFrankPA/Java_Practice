package day13_CustomMethods;

import java.util.Scanner;

public class Combine {
    public static void main(String[] args) {

        System.out.println("enter two words");
        String st1 = new Scanner(System.in).next();
        String st2 = new Scanner(System.in).next();
        System.out.println(combine(st1, st2));

    }
    public static String combine(String str1, String str2){

String result="";

        if(str1.charAt(str1.length()-1)==str2.charAt(0)){ //(str1.endsWith("" + str2.charAt(0) )
         result = str1 + str2.substring(1);
        }else {
        result = str1 + str2;
        }
        return result;



    }

}
/*
Create a method named combine that can take two string and then add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight

 */