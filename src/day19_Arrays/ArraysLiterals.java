package day19_Arrays;

import java.util.Arrays;

public class ArraysLiterals {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums = {10,20,30,40,50};

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(nums));
    }
}
