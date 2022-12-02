package day20_ArrayContinue;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int[] reverse = new int[array.length];
        int k = 0;
        for (int i = array.length - 1; i >= 0;k++, i--) {
            reverse[k] = array[i];
        }
        System.out.println(Arrays.toString(reverse));

        int[] nums = {200,300,400,500,600,700};
        nums = ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(nums));


        double[] db = { 10.5,20.7,40.5,987,5.154};
        db = ArraysUtility.reverse(db);
        System.out.println(Arrays.toString(db));


    }
}
