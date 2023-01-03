package day39_Collections;

import day19_Arrays.ArraysLiterals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class replitSearch {

    LocalDate hny = LocalDate.of(2023,01,01);
    public static String search(ArrayList<String> strs, String find) {

        String result = "";
        for (String each : strs) {
            if (each.startsWith(find)) {
                result = each;
                return result;
            }

        }
        return "search failed";
    }

    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>(Arrays.asList("one apple", "two orange", "four banana", "hey"));

        String find2 = "two";

        System.out.println(search(test, find2));

        int[] arr1 = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        printUniqueNumbers(arr1);

    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE


        for (int i = 0; i < nums.length; i++) {

            int freq = 0;

            for (int i1 = 0; i1 < nums.length; i1++) {
                if (nums[i] == nums[i1]) {
                    freq++;
                }
            }
            if (freq == 1) {
                System.out.println(nums[i]);
            }
       /* ArrayList<Integer> uniquess = new ArrayList<>();

        for (int each : nums) {
            uniquess.add(each);
        }

        uniquess.removeIf(p-> Collections.frequency(uniquess, p) > 1);
        System.out.println(uniquess);
        for(Integer each : nums){
            System.out.println(each);
        }

*/
        }
        System.out.println("------------------------");


        String[] str2 = {"5", "1", "2", "aa", "1", "aa" };
        System.out.println(getDup(str2));

    }

    public static int getDup(String[] arr) {

        ArrayList<String> str = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                str.addAll(Arrays.asList(arr[i]));

            }
        }

        return str.size();
    }


    public static ArrayList<String> swap (ArrayList<String> list, int pos1, int pos2) {


        Collections.swap(list, pos1, pos2);

        return list;


    }


}