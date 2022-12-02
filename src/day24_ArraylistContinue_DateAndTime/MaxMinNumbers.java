package day24_ArraylistContinue_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(-3, -4, -5, 0, 2,3,4,5,6,8,7,9,10,10));
        Collections.sort(numbers);
        System.out.println("second minimum " + numbers.get(1));
        System.out.println("second maximum " + numbers.get(numbers.size()-2));

        System.out.println("==========================");

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(-3, -4, -5,-5, 0, 2,3,4,5,6,8,7,9,10,10));

        numbers2.removeIf(p -> p== Collections.max(numbers2) ||  p== Collections.min(numbers2));
        System.out.println("second maximum " + Collections.max(numbers2));
        System.out.println("second minimum " + Collections.min(numbers2));
        System.out.println(numbers2);

    }
}
/*
Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops
 */