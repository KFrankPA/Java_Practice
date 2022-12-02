package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // if we use variable value once we dont need variable

        System.out.println("Enter the day number: ");

        // int num = new Scanner(System.in).nextInt();
        int num = input.nextInt();

        String day = "Invalid";

        if (num >= 1 && num <= 7) {
            day = (num == 1) ? "Monday" : (num == 2) ? " Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? " Thursday" : (num == 5) ? "Friday"
                    : (num == 6) ? "Saturday" : "Sunday";

        }

        System.out.println(day);
        input.close();

    }


}
