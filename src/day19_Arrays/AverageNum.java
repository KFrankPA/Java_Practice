package day19_Arrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int total = sc.nextInt();
        int[] num = new int[total];
        int sum = 0;
        for (int i = 0; i < total; i++) {
            System.out.println("Enter a number");
            num[i] = sc.nextInt();  // we use "i" to store numbers in Arrays
            sum += num[i];

        }
        DecimalFormat df = new DecimalFormat("0.00");
        double average = sum / (double) total;
        System.out.println(Arrays.toString(num));
        System.out.println("sum = " + sum);
        System.out.println(df.format(average));

    }
}
