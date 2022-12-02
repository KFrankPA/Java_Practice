package day14_forLoop;

import java.util.Scanner;

public class LettersDigitsSpecialCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        String digits = "";
        String letters = "";
        String specCharacters = "";
        String spaces = "";



        System.out.println("enter a sentence");
        String sentence = scan.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);

            if(character >= '0' && character <= '9'){
                digits += character+" ";
            }else if( character >= 'A' && character <= 'Z') {
                letters += character + " ";
            }else if(character >= 'a' && character <= 'z') {
                letters += character + " ";
            }else if(character == ' '){
                spaces += character + " ";
            }else{
                specCharacters += character + " ";
            }
        }
        System.out.println("Digits "+ digits + "\nletters " + letters + "\nSpecial Characters " + specCharacters + "\nSpaces " + spaces);


    }
}
