package oca;

import java.util.Arrays;

public class Oca {
    public static void main(String[] args) {


        int [][] arr = new int[][]{{1,2,3}, {3,4}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);

            }

        }
        System.out.println();
        int nums[] = new int [1];
        nums[0] = 1;
        nums = new int [2];
        nums[1] = 5;
        System.out.println(Arrays.toString(nums));


    }
}
