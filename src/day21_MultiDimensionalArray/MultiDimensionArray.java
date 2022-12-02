package day21_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {

        int [][] arr2D1 = {{10,20,3}, {2,4,5}};
        int [][] arr2D2 = {{5,6,7,8}, {8,9,10,11}, {12,13,3}};
        int [][] arr2D3 = {{20,30}, {40,50}, {2,100}};
//                                 0         1          0            1           2             0        1         2
        int [][][] arr3D = { { {10,20,3}, {2,4,5}}, {{5,6,7,8}, {8,9,10,11}, {12,13,3}} ,  {{20,30}, {40,50}, {2,100}} };
//                                       0                            1                                  2
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[2][1] ));
        System.out.println((arr3D[1][2][0]));

        System.out.println("==========================");

        for (int i = 0; i < arr3D.length; i++) { // i index number of each 2 dimensional array
            int [][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray) );

            for (int j = 0; j < each2DArray.length; j++) { // j is index number of each 1 dimensional array
                int[] each1Darray = each2DArray[j];
                System.out.println(Arrays.toString(each1Darray));
                for (int k = 0; k < each1Darray.length; k++) {
                    int eachElement = each1Darray[k];
                    System.out.println(eachElement);
                }
            }
        }

    }
}
