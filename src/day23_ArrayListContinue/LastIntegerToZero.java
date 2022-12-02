package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LastIntegerToZero {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        numbers.remove(numbers.size()-1);
        numbers.add(numbers.size(), 0);
        System.out.println(numbers);

        numbers.set(numbers.size()-1, 2);
        System.out.println(numbers);


    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];


 */