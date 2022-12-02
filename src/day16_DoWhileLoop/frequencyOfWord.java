package day16_DoWhileLoop;

import java.util.Scanner;

public class frequencyOfWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String str = sc.nextLine();
        System.out.println("enter the word");
        String word = sc.next();
        int count = 0;

        while (str.contains(word)) {
            count++;
            str = str.replaceFirst(word, "");


        }
        System.out.println(count);

    }
}
