package oca;

import java.util.ArrayList;

public class TestDisc {

    public static void main(String[] args) {

        String [] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if(arr[i].equals("C") ){
                continue;
            }
            System.out.println("work done");
            break;
        }

        int num = 5;
        do{
            System.out.println(--num + " ");
        }while(num==0);

        System.out.println("---------------------");

        int arr2 [] = {1,2,3,4};
        int i = 0;
do{
    System.out.println(arr2 [i] + " ");
    i++;
}while(i<arr2.length-1);



    }
        }