package day19_Arrays;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {

      /*  char[] ch = new char[65535];
        for (int i = 0; i < ch.length; i++) { // all 65535 characters
            ch[i] = (char) i;
        }
        System.out.println(ch);
        */

        char[] ascend = new char[26];
        char[] descend= new char[26];
        for (int i = 0, j='A', z= 'Z';  i < ascend.length; j++, z--, i++) {
            ascend[i] = (char)j;
           descend[i] = (char) z;
        }
       System.out.println(Arrays.toString(ascend));
        System.out.println(Arrays.toString(descend));



    }
}
