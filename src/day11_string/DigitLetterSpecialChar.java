package day11_string;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

        String str1 = "";

        System.out.println(str1.length());

        if (str1.length() >= 1) { //if the string has at least one character

            char f = str1.charAt(0); // the first character of string

            if (f >= '0' && f <= '9') {
                System.out.println("The first character is digit");

            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("First character is uppercase letter");

            } else if (f >= 'a' && f <= 'z') {
                System.out.println("First character is lowercase letter");
            } else {
                System.out.println("First character is special character");
            }
        }else{
            System.out.println("String is empty");
        }
    }
}