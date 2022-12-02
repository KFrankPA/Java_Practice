package day15_whileLoop;

import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Will you marry me");
        String yesOrNo = scan.next();

        while( !(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("no")) ){

            System.err.println("Invalid answer, please re-enter");
            yesOrNo = scan.next().toLowerCase();
        }

        if(yesOrNo.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }



    }
}
/*
  Create a class named Marriage proposal and Write a program for the
  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no



 */
