package day20_ArrayContinue;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        String str = Arrays.toString(arr);
        System.out.println(str);
        System.out.println("=============================");

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};

        boolean r = Arrays.equals(a1, a2);
        System.out.println(r);
        System.out.println("=================");

        char[] ch1 = {'a', 'b', 'c'};
        char[] ch2 = {'a', 'c', 'b'};
        boolean r2 = Arrays.equals(ch1, ch2);
        System.out.println(r2);
        System.out.println("=========================");

        int[] nums = {0, 100, 200, 250, 0, 1, 125, 7};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length - 1]);

        String[] str1 = {"A", "B", "C"};
        String[] str2 = {"A", "C", "D"};

        Arrays.sort(str1);
        Arrays.sort(str2);
        System.out.println(Arrays.equals(str1, str2));

        System.out.println("================================");

        int[] array1 = {10, 20, 30, 40, 50, 60, 70};
        int[] array2 = Arrays.copyOf(array1, 7);
        System.out.println(Arrays.toString(array2));

        System.out.println("==================");
        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);
        System.out.println(Arrays.toString(n3));
        for (int i = 0, j = n1.length; i < n2.length; j++, i++) {
            n3[j] = n2[i];
        }
        System.out.println(Arrays.toString(n3));

        System.out.println("===========================");

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 6, 7, 8, 9, 10};
        int[] c = Arrays.copyOf(a, a.length + b.length);

        for (int i = 0, k = a.length; i < b.length; k++, i++) {
            c[k] = b[i];
        }

        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        char[] result1 = Arrays.copyOf(ch, 15);
        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch, 3, 6+1); // excludes ending index
        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 1, ch.length);
        System.out.println(Arrays.toString(result3));

    }
    }

