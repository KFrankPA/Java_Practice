package day25_Constructors;

import java.util.Arrays;

public class warmup {
    public int[] frontPiece (int [] nums){
        int newArr[];
        if(nums.length > 2) {
         newArr = Arrays.copyOf(nums, 2);
            return newArr;
        } else{
            newArr = Arrays.copyOf(nums, 1);
        }
       return newArr;
    }

}
