package replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class timetwo {
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){

        for (int i = 0; i < nums.size(); i++) {

            if(nums.get(i) != 0){
                nums.set(i, nums.get(i) * 2);
            }

            }




        return  nums;


    }


    public static ArrayList<String> combine(String[] r1, String[] r2){

        // your code here
         ArrayList <String> str = new ArrayList<>();

          str.addAll(Arrays.asList(r1));
          str.addAll(Arrays.asList(r2));



return str;

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 0));
        System.out.println(timesTwo((ArrayList<Integer>) list));


        String[] arr1 = {"A", "B", "c", "Akmal"};
        String[] arr2 = {"g", "h", "q", "5"};
        System.out.println(combine(arr1, arr2));

    }
}

