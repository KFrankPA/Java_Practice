package day10_string;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {


        String word = "CYdeo";
        //index:       01234
        char firstChar = word.charAt(0);
        char secondChar = word.charAt(1);
        char thirdChar = word.charAt(2);
        char fourthChar = word.charAt(3);
        char fifthChar = word.charAt(4);


        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("----------------------------------");

        String sentence = "Java Programming Language";
        int length = sentence.length();

        int lastIndex = length - 1;

        System.out.println(length);
        System.out.println(lastIndex);

        System.out.println("-----------------------------------");

        String s1 = "Java is the best programming language";

        char f = s1.charAt(0); // first character

        int lastIndexNum = s1.length() - 1; // length of index -1 to get the last index number, int because numbers
        char l = s1.charAt(lastIndexNum);

        System.out.println(f);
        System.out.println(l);
        System.out.println("-----------------------------------");

        String name1 = "Umran";
        String name2 = new String("Umran");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        System.out.println("-------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if(age>=21 && answer.equals("yes")){
            System.out.println("Eligible to vote");

        }else{
            System.out.println("Not eligible to vote");
        }
input.close();

    }
}
