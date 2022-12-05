package day27_AccessModifiers;

import java.util.Arrays;

public class Data {

        public int a, b, c;

        public static int d, e, f;


        public void method1(){
            System.out.println("Method 1");
        }

        public void method2(){
            System.out.println("Method 2");
        }

        public static void method3(){
            System.out.println("Method 3");
        }

        public static void method4(){
            System.out.println("Method 4");
        }


    }




/*

        int arr[] = {3, 3};
        int target = 6;
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if ((arr[i] + arr[j] == target) && (arr[i] != arr[j])) {
                    result[1] = i;
                    result[0] = j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));
 */