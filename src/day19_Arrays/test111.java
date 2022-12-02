package day19_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers u want");
        int num = sc.nextInt();

        int numbers[] = new int[num];
        int enteredN;
        double averageN=0;
        double sum=0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter numbers");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
            averageN = sum/num;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("sum " + sum);
        System.out.println("average num " + averageN);
    }
}

