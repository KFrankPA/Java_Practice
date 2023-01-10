package replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class times2 {
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
        // TODO: finish the method
        for(Integer each : nums){
            if(each != 0){
                nums.set(each , each * 2);
            }else{
                continue;
        }

    }
        return  nums;




}

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,0));
        System.out.println(timesTwo((ArrayList<Integer>) list));
    }

}
