package day21_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalPractice {
    public static void main(String[] args) {

        String [] group1 ={"Daniel", "Mike", "Anna", "Savannah"};  // 4 names
        String [] group2 ={"Gulten", "Shoira", "Sevket"};  // 3 names
        String [] group3 ={"Kate", "Jimmy"};  // 2 names
        String [] group4 ={"Julia"};  // 1 name

        String [][] container = {group1, group2, group3, group4 };

        for (String[] eachContainer : container) {
            System.out.println(Arrays.toString(eachContainer));
            for (String eachElement : eachContainer) {
                System.out.println(eachElement);
            }
        }
        System.out.println("=================================");

        for (String[] each : container) {
            System.out.println(Arrays.toString(each));
            for (int i = 0; i < each.length; i++) {
                System.out.println(each[i]);
            }
        }
        System.out.println("===========================");
        for (String[] each2 : container) {
            System.out.println(Arrays.toString(each2));
            for (int i = each2.length - 1; i >= 0; i--) {
                System.out.println(each2[i]);

            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++");
        for (int i = container.length - 1; i >= 0; i--) {
            //System.out.println(Arrays.toString(container[i]));
            String[] newContainer = container[i];
            System.out.println(Arrays.toString(newContainer));
            for (String eachOne : newContainer) {
                System.out.println(eachOne);
            }
        }


    }
}
