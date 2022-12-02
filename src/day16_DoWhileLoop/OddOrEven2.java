package day16_DoWhileLoop;

import java.util.Scanner;

public class OddOrEven2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is an even number");

            } else {
                System.out.println(num + " is an odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            String answer = sc.next().toLowerCase();

            while (!(answer.equals("yes") || (answer.equals("no")))) { // while the user provides invalid answer
                System.out.println("Invalid entry! Would you like to enter another number? Yes/No");

                answer = sc.next().toLowerCase();

                if (answer.equals("no")) {
                    break;

                }

            }
        }
    }
}