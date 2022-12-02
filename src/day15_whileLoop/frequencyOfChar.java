package day15_whileLoop;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class frequencyOfChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word");
        String str = scan.next();

        System.out.println("Enter a character");
        char ch = scan.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if(eachChar == ch){
                frequency++;
            }

        }
        System.out.println(frequency);
    }
}
/*
 Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char,
  that returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

                System.out.println("enter a word");
        String str = scan.next();
        char ch = scan.next().charAt(0);
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if(eachChar == ch){
                frequency++;
            }

        }
        System.out.println(frequency);
 */