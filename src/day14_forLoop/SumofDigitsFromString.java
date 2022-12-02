package day14_forLoop;

import java.util.Scanner;

public class SumofDigitsFromString {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String str =  "A1B2C3";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                sum += ch - 48;
            }
        }

        System.out.println("sum = " + sum);


    }

}
