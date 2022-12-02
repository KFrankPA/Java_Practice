package day25_Constructors;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class replit {
    public static void main(String[] args) {

     String sentence = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
     String [] arr = sentence.split(", ");
     String minimum = arr[0];
     String result = "";

        int shortStr = arr[0].length();
        for (int i = 0; i < arr.length; i++) {

            if(arr[i].length() < minimum.length()){
                minimum = arr[i];
                result="";
            }
            if(minimum.length() == arr[i].length()){
                result += arr[i] + " ";

            }

        }
        System.out.println(result);

    }
}
