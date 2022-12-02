package day11_string;
import java.util.Scanner;
public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = scan.next();

        System.out.println("Enter second word");
        String word2 = scan.next();

        String strin1 = word1.substring(1);
        String strin2 = word2.substring(1);

        System.out.println(strin1+strin2);
    }
}
/*
Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana

 */