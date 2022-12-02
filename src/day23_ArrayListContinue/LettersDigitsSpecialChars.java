package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        String[] str2 = str.split("");

        ArrayList<Character> ch = new ArrayList<>();
        ArrayList<Character> specialCh = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();

        for (char each : str.toCharArray() ) {
            if(Character.isDigit(each)) {
                digits.add(each);
            }else if(Character.isLetter(each)){
                ch.add(each);
            }else{
                specialCh.add(each);
            }

        }
        System.out.println("digits = " + digits);
        System.out.println("specialCh = " + specialCh);
        System.out.println("ch = " + ch);

    }
}
/*
Write a program that can extract the special characters,
digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}

 */