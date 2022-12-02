package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,8,7,8,7,9,2,3,9));
       int max= Collections.max(numbers);
        System.out.println(max);
        System.out.println("===============");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));
        int n = 3;
        for (int i = 1; i < n; i++) {
            list.removeIf(p -> Collections.max(list) == p);
        }
        System.out.println(Collections.max(list));
        }
    }

/*
write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */