package day21_MultiDimensionalArray;

import java.util.Arrays;

public class ILoveArrays {
    public static void main(String[] args) {
        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        for (String[][][][][][][][][] each1 : array) {
            for (String[][][][][][][][] each2 : each1) {
                for (String[][][][][][][] each3 : each2) {
                    for (String[][][][][][] each4 : each3) {
                        for (String[][][][][] each5 : each4) {
                            for (String[][][][] each6 : each5) {
                                for (String[][][] each7 : each6) {
                                    for (String[][] each8 : each7) {
                                        for (String[] each9 : each8) {
                                            for (String each : each9) {
                                                System.out.print(each +" ");
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }

        }

    }
}
/*
3. Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can display each elements of the given array


 */