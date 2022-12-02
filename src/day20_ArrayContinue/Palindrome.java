package day20_ArrayContinue;

import javax.print.event.PrintEvent;

public class Palindrome {
    public static void main(String[] args) {

        String[] str = {"anna", "level", "Java"};

        int count = 0;
        for (String each : str) {
            String reverse = "";
            for (int i = each.length()- 1; i >= 0; i--) {
                reverse += each.charAt(i) ;
            }
            reverse +=" ";
            if (each.equalsIgnoreCase(reverse)) {
                count ++ ;
            }
            System.out.println(reverse + count);
        }

        String[] str2 = {"anna", "level", "Java"};

        for (String each : str2) {
            String result2 = "";
            for(int i = each.length()-1; i>=0; i--){
                result2 +=each.charAt(i);
            }
           // result2 += " ";
            if(result2.equals(each)){
                System.out.print(result2 + " ");
            }

        }





    }
}

/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */