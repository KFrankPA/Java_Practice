package day19_Arrays;

import java.util.Arrays;

public class IntReverse {
    public static void main(String[] args) {

        int [] num = {2,3,4,5,6, 7,9,10};

        int[] reverse = new int[num.length];

        for (int i = num.length-1, j = 0 ; i >=0;j++, i--) {
            reverse[j] = num[i];

        }

        System.out.print(Arrays.toString(reverse));


    }
}
/*

6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};


 */