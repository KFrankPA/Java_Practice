package day24_ArraylistContinue_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElementOfArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));


            nums.removeIf(p-> Collections.frequency(nums, p)>1);
        System.out.println(nums);




    }
}
/*
1. Write a program that can display the unique elements of an arrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops

	ArrayList<Integer> nums = new ArrayList<>();
	nums.addAll(Arrays.asList(1,1,2,3,3,4,5,5));
	int freq = 0;
	nums.removeIf(p-> Collections.frequency(nums, p)>1);

 */