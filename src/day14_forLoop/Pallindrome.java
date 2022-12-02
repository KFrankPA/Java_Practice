package day14_forLoop;

public class Pallindrome {
    public static void main(String[] args) {
        String str = "level";
char ab;
        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            result += str.charAt(i);
        }

        boolean isPalindrome = result.equalsIgnoreCase(str);
        System.out.println(isPalindrome);

        System.out.println("--------------------");

        String str2 = "Java";
        String reverse ="";

        for (int i = str2.length()-1; i >= 0  ; i--) {

            reverse += str2.charAt(i);
        }
        System.out.println(reverse);
    }

}
/*
Write a program that can check if the given String is palindrome
			Ex:
				input:
					Level
				output:
					true
				input:
					Anna
				output:
					true
   */