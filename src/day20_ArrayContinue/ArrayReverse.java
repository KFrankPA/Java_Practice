package day20_ArrayContinue;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        String str = "i Love Java and also Python";
        String[] arrayStr = str.split(" ");
        String reverse = "";
        String result = "";

        for (int i = 0; i < arrayStr.length; i++) {

            if (i == 1) {
                reverse = arrayStr[i];
                for (int k = reverse.length() - 1; k >= 0; k--) {
                    result += reverse.charAt(k);
                }
                result += " ";
            }else{
                result += arrayStr[i] + " ";
            }
        }
        System.out.println(result);
String nArray [] = result.split(" ");
        System.out.println(Arrays.toString(nArray));






       String newStr = "Ilham needs to buy a new computer";
       String [] arrayStr2 = newStr.split(" ");
       String reverse2 = "";
       String resultNew = "";

        for (int i = 0; i < arrayStr2.length; i++) {
            if(i == 1){
                reverse2 = arrayStr2[i];
                for(int k = reverse2.length()-1; k>=0; k--){
                    resultNew += reverse2.charAt(k);
        }
                resultNew += " ";
            }else{
                resultNew += arrayStr2[i] + " ";

            }
        }
        System.out.println(resultNew);
        }
    }
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */