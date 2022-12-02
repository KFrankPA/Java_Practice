package day15_whileLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int maxNum = 0;
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the number");
            int num = scan.nextInt();


            if(num < maxNum){
                maxNum = num ;
            }

        }
        System.out.println(maxNum);

    }
}
