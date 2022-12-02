package day24_ArraylistContinue_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllLEtters {
    public static void main(String[] args) {

        ArrayList<Character> ch = new ArrayList<>();
        ch.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        ch.add('L');
        ch.removeIf(p -> Character.isLetter(p));
        System.out.println(ch);


    }
}
/*
 Write a program that can remove all the letters from an arrayList of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$',  '1', '2', '@', '!', '3', '4']

 */