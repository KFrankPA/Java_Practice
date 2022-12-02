package day20_ArrayContinue;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        int[] numbers ={ 1,2,3,4,5,6,7,8,9,10,11};
        for (int each : numbers) {
            if(each % 2 !=0){
                System.out.println(each);
            }
        }
        int[] num ={10,20,30,40,50,60,100,200,300,500,5,1,75};

        int max= num[0];
        for (int each : num) {
            if(each>max){
                max = each;
            } }
        System.out.println("max " + max);
        int min = num[0];
        for (int each : num) {
            if(each<min){
                min=each;
            } }
        System.out.println("min " + min);
        System.out.println("==========================");

        int[] number ={ 1,2,3,4,5,6};
        int[] number2={15,20,25,30,35,40};
        int[] merge=new int[number2.length + number2.length];
        int k = 0;

        for (int each : number) {
           merge[k++] = each;
        }
        for (int each : number2) {
            merge[k++] = each;
        }
        System.out.println(Arrays.toString(merge));
    }
}
