package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoStringArrays {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        String[] combinedArr = new String[arr1.length + arr2.length];
int k=0;
        for (int i = 0; i < arr1.length; k++, i++) {

            combinedArr[k] = arr1[i];
        }
            for (int j = 0; j < arr2.length; k++, j++) {
                combinedArr[k] = arr2[j];
            }
        System.out.println(Arrays.toString(combinedArr));

        System.out.println("=============================");

        String[] ab = {"A", "B", "C"};
        String[] cd = {"D", "E", "F", "G"};

        ArrayList<String> abc = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        abc.addAll(Arrays.asList(ab));
        abc.addAll(Arrays.asList(cd));
        System.out.println(abc);

        System.out.println("====================");
        for (String each : ab) {
            list.add(each);

        }
        for (String each : cd) {
            list.add(each);

        }
        System.out.println(list);


    }
}
/*
2. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};

                output:
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */