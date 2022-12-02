package day13_CustomMethods;
import java.util.Scanner;
public class FrequencyofWord {
    public static void main(String[] args) {

        System.out.println("type sentence");
        String sentence = new Scanner(System.in).nextLine();
        System.out.println("enter word");
        String word = new Scanner(System.in).next();
        System.out.println(frequencyOfWord(sentence,word));

    }

    public static int frequencyOfWord (String sentence, String word){

        int origLength = sentence.length();
        String newSent = sentence.toLowerCase().replace(word.toLowerCase(), word.toLowerCase().substring(1));
        int newLength = newSent.length();
        int frequencyOfWord = origLength - newLength;
        System.out.println(frequencyOfWord);
        return frequencyOfWord;

    }

    }

   /* public static int frequencyOfWord(String sentence, String word){

        int sentLength = sentence.length();

    //    sentence.replace("")

 //   }*/
