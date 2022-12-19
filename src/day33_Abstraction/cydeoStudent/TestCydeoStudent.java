package day33_Abstraction.cydeoStudent;

import java.time.LocalDate;
import java.util.Arrays;

public class TestCydeoStudent {
    public static void main(String[] args) {

        CydeoDevStudent student1 = new CydeoDevStudent("John", 'M', LocalDate.of(2000,01,03), "A78", "zero to hero", 28);

        System.out.println(student1);

        populate(5);
    }
    public static void populate(int n){
        int[] arr = new int[n];
        for(int i = 1, k = 0; i <= n;k++, i++){
            arr[k] = i;
        }
        System.out.println(Arrays.toString(arr));


    }


}
