package day22_WrapperClassesArrayListIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class testreplit {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] newArray = new int[a.length];

        int ind = 1;
        for (int i = 0, j = 0; i < a.length; j++, i++) {
            if (ind != a[i]) {
                newArray[j] = a[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}