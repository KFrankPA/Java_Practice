package day30_OOP_inheritance;

import java.util.ArrayList;

public class replit {
    public static void main(String[] args) {
        String strnew = "";
        String str = "java methods";
        String str2 = "me";
        int str2l = str.length();

        if (str.contains(str2)) {
           str = str.replace(str2, "[" + str2 + "]");

        }else{
            str = "[" + str + "]";
        }
        System.out.println(str);


    }
}
