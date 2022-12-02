package day15_whileLoop;

import java.util.Scanner;

public class MaxAndMinimum {
    public static void main(String[] args) {

        int max= -20000000;
        int min = 20000000;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num>max){
                max = num;
            }
         if(num<min){
             min=num;
         }
        }
        System.out.println(min + " " + max);


    }
}
