package day21_MultiDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,40,50};
        int[] arr3 = {60,70,80,90,100};

        System.out.println("=========================");

        int [][] arr2D = {{10,20,30}, {40,40,50}, {60,70,80,90,100}};

        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println((arr2D[2][2]));


    }
    }








