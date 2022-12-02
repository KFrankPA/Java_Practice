package day20_ArrayContinue;

import java.util.Arrays;
import java.util.jar.Attributes;

import utilities.ArraysUtility;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};
        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure arr3 has enough capacity to contain arr1 and arr2 elements
        int k = 0;
        for (int i = 0; i < arr1.length; k++, i++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; k++, i++) {
            arr3[k] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] a2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 50};
        int[] a3 = ArraysUtility.merge(a1, a2);
        System.out.println(Arrays.toString(a3));

        double[] d1 = {1.1, 2.2, 9.5, 10.78};
        double[] d2 = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 5.0};
        ArraysUtility.merge(d1, d2);
        double[] d3 = ArraysUtility.merge(d1, d2);
        System.out.println(Arrays.toString(ArraysUtility.merge(d1, d2)));
        System.out.println(Arrays.toString(d3));

        char[] ch1 = {'a', 'b', 'c', 'g'};
        char[] ch2 = {'k','h','m','q' };
        char[] ch3 = ArraysUtility.merge(ch1,ch2);
        System.out.println(Arrays.toString(ch3));

        String [] str1 = {"vasya", "iPad", "Nissan"};
        String [] str2 = {"key", "phone", "monitor"};
        String[] str3 = ArraysUtility.merge(str1, str2);
        System.out.println(Arrays.toString(str3));

    }

}
