package day15_whileLoop;


import java.util.Scanner;

public class minimumNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minNum = 0 ;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number");
            int num = scan.nextInt();

            if (minNum > num) {
                minNum = num;
            }
        }  System.out.println(minNum);





    }
}
