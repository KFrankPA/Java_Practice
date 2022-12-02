package day11_string;
import java.util.Scanner;
public class CombineWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = scan.next();

        System.out.println("Enter second word");
        String word2 = scan.next();

        int lastOfWord1 = word1.length()-1;
        char first = word1.charAt(lastOfWord1);
        char second = word2.charAt(0);

        if(first == second) {
            System.out.println(word1 + word2.substring(1));
        }else{
            System.out.println(word1 + word2);
        }
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Word");

        String word = sc.next();
        String word2 = sc.next();

        if(word.charAt(word.length()-1) == word2.charAt(0)){
            System.out.println(word + word2.substring(1));

        }else {
            System.out.println(word + word2);

         */
scan.close();
    }
}
/*
Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight


 */