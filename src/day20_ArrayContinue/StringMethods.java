package day20_ArrayContinue;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cydeo School";
       char[] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));
        System.out.println("=============================");

        String str2 = "Today is a great day to learn java";
        String [] words = str2.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("========================");

        String str3 = "I love Java";
      String[] strR=  ArraysUtility.reverse(str3.split(" "));
        System.out.println(Arrays.toString(strR));

        String reversed = "";

        for (int i = 0; i < strR.length; i++) {
            reversed += strR[i] + " ";
        }
        System.out.print(reversed);






    }
}
