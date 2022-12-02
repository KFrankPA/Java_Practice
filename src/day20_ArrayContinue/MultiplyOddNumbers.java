package day20_ArrayContinue;

import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < num.length; i++) {

            if(num[i]%2==0) {
                continue;
            }
                num[i] = num[i] * 2;
        }
        System.out.println(Arrays.toString(num));

    }
}
