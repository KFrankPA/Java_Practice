package day21_MultiDimensionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int element = 6;
        int[] arr2 = Arrays.copyOf(arr, arr.length + 1);

        arr2[arr2.length - 1] = element;
        System.out.println(Arrays.toString(arr2));

        System.out.println("==============================");

        int[] array = {10, 20, 40, 60, 80};
        array = ArraysUtility.addElement(array, 2022);
        System.out.println(Arrays.toString(array));

        double[] array3 = {1.5, 2.5, 10, 5, 5};
        array = ArraysUtility.addElement(array, 5);
        System.out.println(Arrays.toString(array));
        boolean tF = false;
        int element3 = 5;
        for (double each : array3) {
            if (each == element3) {
                tF = true;
            }else {
                tF=false;
            }
        }
        System.out.println(tF);
        System.out.println(ArraysUtility.contains(arr,2));

    }
}
