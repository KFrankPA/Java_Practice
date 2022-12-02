package day09_scanner;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number ");
        int num =input.nextInt();

        String users = (num> 0 && num <=6) ?
                (num < 3) ? "Live with less than 3 people"
                        : (num <= 3 && num <= 6) ? "Live with 3 - 6 people"
                        : "Live with more than 6 people"
                : "Invalid number";
        System.out.println("Enter number of people " + users);



        input.close();


    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"


 */