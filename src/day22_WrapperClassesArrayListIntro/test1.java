package day22_WrapperClassesArrayListIntro;

import utilities.ArraysUtility;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {

        String[] test1 = {"baby", "car", "laptop", "iPad", "keyboard"};
        System.out.println(ArraysUtility.contains(test1,"iPa1d"));

String str2 ="";
        for (int i = 0; i < test1.length; i++) {
            if(test1[i]==test1[2]) {
                continue;
            }else{
                str2 += test1[i]+" ";
            }
        }
        String[] str = str2.split(" ");
                System.out.println(str2);
        System.out.println(Arrays.toString(str));

        int arr1 [] = {2,4,6,7,8,9,10};
        int a = 22;

        arr1 = ArraysUtility.addElement(arr1, a);
        System.out.println(Arrays.toString(arr1));

    }
}
