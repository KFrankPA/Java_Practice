package day13_CustomMethods;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String word1 = scan.next();
        String word2 = scan.next();
        System.out.println(capitalized(word1, word2));


    }
    public static String capitalized(String word1, String word2){

        word1= word1.substring(0,1).toUpperCase() + word1.substring(1).toLowerCase();
        word2= word2.substring(0,1).toUpperCase() + word2.substring(1).toLowerCase();

       String newWords = word1 + "\n" + word2;

        return  newWords;



    }
}
