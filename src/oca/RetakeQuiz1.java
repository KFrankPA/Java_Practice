package oca;

import java.util.Arrays;

public class RetakeQuiz1 {
    public static void main(String[] args) {
        String a = "HI";
        String n = "Hello";

        int[][] arr = new int[][] {{1,2},{3,4}};
        System.out.println( Arrays.toString(arr[1]));
        arr[1] = arr[0];

        System.out.println( Arrays.toString(arr[1]));

        System.out.println("--------------------------------------");


        String [][] strarr = {{"A", "B", "C", "K", "L"}, {"D", "E"}};

        for (int i = 0; i < strarr.length; i++) {
            for (int j = 0; j < strarr[i].length; j++) {
                System.out.print(strarr[i][j]);
               if(strarr[i][j].equals("B")){
                    System.out.println();
                    break;
                }
            }
        }
        System.out.println();
        int[] arr1 = new int[3];
        int[] arr2 = {2,3,4,5,6,7,8,9};
        arr1 = arr2;

        System.out.println(Arrays.toString(arr1));

        System.out.println("---------------------------");

        String ta = "A ";
        ta = ta.concat("B ");
        System.out.println(ta);
        String tb = "C ";
        ta=ta + tb;
        System.out.println(ta);
        ta.replace('A', 'Y');
        System.out.println(ta);
        ta = ta + tb;
        System.out.println(ta);

        System.out.println("-------------------------");

        int nums[];
        nums= new int[2];
        nums[0] = 10;
        nums[1] = 20;
        System.out.println(Arrays.toString(nums));


        nums = new int[4];
        nums[2] = 30;
        nums[3] =40;

        System.out.println(Arrays.toString(nums));

        System.out.println("======------============================");

       String s = "Cydeo School";
        System.out.println(s.length());
       int l = s.length();
        System.out.println(l);

        int[][] af = {{'A'},{'T'}};
        System.out.println("-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    int y = 9;
        System.out.println(y);
    if(++y < 10){
        System.out.println("HI");
    }else{
        System.out.println("po" + y);
    }
        System.out.println(y);

String str = new String("Jua");


        System.out.println(str);

StringBuilder str2 = new StringBuilder("Wooden");
str2.append("Spoon");
        System.out.println(str2);

    }
}
