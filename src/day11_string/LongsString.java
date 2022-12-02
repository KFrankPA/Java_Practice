package day11_string;

import java.util.Scanner;

public class LongsString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string");
        String first = input.nextLine();

        System.out.println("Enter the second string");
        String second = input.nextLine();


        input.close();

        if(first.length()> second.length()) {
            System.out.println("first string is largest");
        }else if(first.length()< second.length()){
            System.out.println("second string is largest");
        }else{
            System.out.println("Equal");
        }

input.close();
    }
}
