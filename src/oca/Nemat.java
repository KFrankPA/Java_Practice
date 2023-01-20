package oca;

import java.util.Arrays;
import java.util.HashMap;

public class Nemat {
    public static void main(String[] args) {


        String inputNumbers = "799, 719, 720, 850, 1200, 5";
        inputNumbers = inputNumbers.replaceAll(" ", "");
        String[] array = inputNumbers.split(",");

        int[] arr = new int[array.length];
        int minNum = Integer.parseInt(array[0]);
        // int minNum =0;

        int max = Integer.parseInt(array[0]);


        for (int i = 0; i < array.length; i++) {

            arr[i] = Integer.parseInt(array[i]);
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Arrays.sort(arr);

        System.out.println("Min value " + minNum);
        System.out.println("Max value " + max);


        int[] arr2 = {2, 5, 4, 7, 0, 8, 9, 44, 5, 665, 4};

        // int min = arr2[0];
        // int max2 = arr2[0];

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int min = arr2[0];
        int max2 = arr2[arr2.length - 1];

        System.out.println("max2 = " + max2);
        System.out.println("min = " + min);

        String str = "aaabbccdddd";

        HashMap <Character, Integer> freq = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (freq.containsKey(c)) {
                    freq.put(c, freq.get(c) + 1);
                } else {
                    freq.put(c, 1);
                }
            }

            System.out.println(freq);

        System.out.println("----------------------");
      /*  for (int i = 0; i < str.length(); i++) {
            int num = 0;

            eachWord = "" + str.charAt(i);

            if(eachWord.equalsIgnoreCase("" + str.charAt(i))){
               num++ ;

            }
            System.out.print(str.charAt(i)+ "" + num + " ");
        }*/

       int num = 1;


       int av = 10;
       Integer vvv= av;

        System.out.println(num);

        Character ab = 'a';
        Character b = 'a';

        System.out.println(ab.equals(b));

    }
}
