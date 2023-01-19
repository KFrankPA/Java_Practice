package oca;

import java.util.Arrays;

public class Test55 {
               int l =5;
    public static void main(String[] args) {


        int[][] arr = new int[2][4];

        System.out.println(Arrays.deepToString(arr));

        arr [0] = new int[]{1,2,3,4};
        System.out.println(Arrays.deepToString(arr));
        arr [1] = new int[]{5};
        System.out.println(Arrays.deepToString(arr));
        arr[1] = new int[]{2};
        System.out.println(Arrays.deepToString(arr));

        System.out.println("---------------");

        for (int[] ints : arr) {
            for (int each : ints) {
                System.out.print(each);

            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("----------------------------");

        String [][] strArr  = new String[5][10];
        strArr[0] = new String[100];
        strArr[1] = new String[5];

        int a = 97;

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                strArr[i][j] = "" + a ;
                a++;
            }
        }
        for (String[] eachArr : strArr) {
            for (String each : eachArr) {
                System.out.print(each + " ");
            }
          //  System.out.println();

        }
        

    }
}
