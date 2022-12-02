package day15_whileLoop;

import java.util.Scanner;

public class Until_Negative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int sum = 0;

        while (true) {
            System.out.println("Enter a number");
        int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
        }
        System.out.println(sum);

/*
        int sum = 0;

        while(true){
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if( num < 0){
                break;
            }
            sum += num;
        }


        System.out.println(sum);

     sc.close();
*/
    }
}
/*
Create a class named UntilNegative and Write a program that calculates
the sum of numbers entered by the user until user enters a negative number.
 */