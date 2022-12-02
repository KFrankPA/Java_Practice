package day16_DoWhileLoop;

import java.util.Scanner;

public class FrequencyOfChar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("word");
        String str = sc.next();

        char ch ;
        String result ="";


        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if(ch == ch2){
                    count ++ ;
            }
            }
            if(result.contains("" + ch)){
                continue;
            }
            result += ch;
            result += count;
        }
        System.out.println(result);
        }

}
/*
Write a program that can find the frequency of the characters from a string
                         Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */