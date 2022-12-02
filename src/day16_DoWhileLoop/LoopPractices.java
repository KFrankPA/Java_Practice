package day16_DoWhileLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            System.out.println("Hello " + i);
        }
        System.out.println("----------------------------");
//===================================================================================

        for (int i = 0; i < 5; i++) {
            System.out.println("Hey " + i);
        }
        System.out.println("-----------------------------");
// ===================================================================================
        int j = 0;
        while (j < 5) {
            j++;
            System.out.println(j);
        }
        int k = 0;
        do {
            System.out.println("Cydeo " + k);

            k++;
        } while (k < 5);

        Scanner sc = new Scanner(System.in);




    }
}
