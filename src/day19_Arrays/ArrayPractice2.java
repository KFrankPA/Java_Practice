package day19_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        
        int[] arr1 = new int[100];

       /* for (int i = 0, j = 1; i < arr1.length; i++ , j++) {
            arr1[i] = j;
        }
        System.out.println("arr1= " + Arrays.toString(arr1));
        System.out.println("=================================");
*/
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[100];

        /*for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 100 - i;
        }
         */
        for (int i = 0, j=100; i < arr2.length; i++, j--) {
            arr2[i] = j;

        }
        System.out.println("arrs2" + Arrays.toString(arr2));

        System.out.println("=======================");

        String[] month ={"Jan", "Feb", "March", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "November", "December"};
        String [] month2 = new String[5];

       for (int i = 0; i < month.length; i++) {
            System.out.print(month[i] + " ");
        }

        System.out.println("\n====================");

        for (int i = month.length-1; i >= 0; i--) {
            System.out.print(month[i] + " ");
        }


        }

}
