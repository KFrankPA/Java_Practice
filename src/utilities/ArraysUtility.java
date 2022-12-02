package utilities;

import java.util.Arrays;

public class ArraysUtility {
    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure arr3 has enough capacity to contain arr1 and arr2 elements
        int k = 0;
        for (int i = 0; i < arr1.length; k++, i++) { // i for first array's index num
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; k++, i++) { // i for second array's ind num
            arr3[k] = arr2[i];
        }
        return arr3;
    }
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length]; // to make sure arr3 has enough capacity to contain arr1 and arr2 elements
        int k = 0;
        for (int i = 0; i < arr1.length; k++, i++) { // i for first array's index num
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; k++, i++) { // i for second array's ind num
            arr3[k] = arr2[i];
        }
        return arr3;
    }
    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length]; // to make sure arr3 has enough capacity to contain arr1 and arr2 elements
        int k = 0;
        for (int i = 0; i < arr1.length; k++, i++) { // i for first array's index num
            arr3[k] = arr1[i];
        }
        for (char i = 0; i < arr2.length; k++, i++) { // i for second array's ind num
            arr3[k] = arr2[i];
        }
        return arr3;
    }
    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length]; // to make sure arr3 has enough capacity to contain arr1 and arr2 elements
        int k = 0;
        for (int i = 0; i < arr1.length; k++, i++) { // i for first array's index num
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; k++, i++) { // i for second array's ind num
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        int k = 0;
        for (int i = array.length - 1; i >= 0; k++, i--) {
            reverse[k] = array[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length];
        int k = 0;
        for (int i = array.length - 1; i >= 0; k++, i--) {
            reverse[k] = array[i];
        }
        return reverse;
    }

    public static char[] reverse(char[] array) {
        char[] reverse = new char[array.length];
        int k = 0;
        for (int i = array.length - 1; i >= 0; k++, i--) {
            reverse[k] = array[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        int k = 0;
        for (int i = array.length - 1; i >= 0; k++, i--) {
            reverse[k] = array[i];
        }
        return reverse;

    }
    public static int[] addElement(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static double[] addElement(double[] array, double element) {
        double[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static char[] addElement(char[] array, char element) {
        char[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static String[] addElement(String[] array, String element) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static boolean contains(int[] arr, int element) {
        for (int each : arr) {
            if (each == element) {
                return true;

            }
        }
        return false;
    }

    public static boolean contains(double[] arr, double element) {
        for (double each : arr) {
            if (each == element) {
                return true;

            }
        }
        return false;
    }

    public static boolean contains(char[] arr, char element) {
        for (char each : arr) {
            if (each == element) {
                return true;

            }
        }
        return false;
    }

    public static boolean contains(String[] arr, String element) {

        for (String each : arr) {
            if (each.equals(element)) {
                return true;

            }
        }
        return false;
    }

    public static int [] removeByIndex(int[] arr, int arrIndex){
        int[] newArray = new int [arr.length-1];
        for (int i = 0, k =0; i < arr.length; i++) {
            if(i != arrIndex){
                newArray[k] = arr[i];
                k++;
            }
        }
        return newArray;
    }

    public static String [] removeByIndex(String[] arr, int arrIndex){
        String[] newArray = new String [arr.length-1];
        for (int i = 0, k =0; i < arr.length; i++) {
            if(i != arrIndex){
                newArray[k] = arr[i];
                k++;
            }
        }
        return newArray;
    }

    public static char [] removeByIndex(char[] arr, int arrIndex){
        char[] newArray = new char [arr.length-1];
        for (char i = 0, k =0; i < arr.length; i++) {
            if(i != arrIndex){
                newArray[k] = arr[i];
                k++;
            }
        }
        return newArray;
    }

    public static double [] removeByIndex(double[] arr, int arrIndex){
        double[] newArray = new double [arr.length-1];
        for (int i = 0, k =0; i < arr.length; i++) {
            if(i != arrIndex){
                newArray[k] = arr[i];
                k++;
            }
        }
        return newArray;
    }


}

