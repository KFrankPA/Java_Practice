package Week04_review;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class CombineTwoWords {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Word");

        String word = sc.next();
        String word2 = sc.next();

        if(word.charAt(word.length()-1) == word2.charAt(0)){
            System.out.println(word + word2.substring(1));

        }else {
            System.out.println(word + word2);

        }


    }
}
