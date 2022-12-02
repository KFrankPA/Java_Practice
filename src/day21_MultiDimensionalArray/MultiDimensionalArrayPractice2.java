package day21_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {

        int [][][] arr3D1 = { { {1,2,3}, {2,4,5}}, {{5,6,7,8}, {8,9,1,11}, {12,1,3}} ,  {{1,30}, {4,5}, {2,10}} };
        int [][][] arr3D2 = { { {10,20,3}, {2,4,5}}, {{5,6,7,8}, {8,9,10,11}, {12,13,3}} ,  {{20,30}, {40,50}, {2,10}} };
        int [][][] arr3D3 = { { {1,2,3}, {2,4,5}}, {{5,6,7,8}, {2,3,4}, {7,9}} ,  {{4,6}, {2,1}, {2,1}} };

        int[][][][] arr4D = {arr3D1,arr3D2,arr3D3};
        System.out.println(Arrays.deepToString(arr4D));
        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    System.out.println(Arrays.toString(each1D));
                    for (int eachElement : each1D) {
                        //System.out.print(eachElement+",");
                    }
                }
            }
        }
    }
}
