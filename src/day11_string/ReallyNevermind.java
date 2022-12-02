package day11_string;
import java.util.Scanner;
public class ReallyNevermind {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();

String result = "";

       if(word.endsWith("ly")){
result= "Really";
       }else{
           result= "Never mind";
       }
        System.out.println(result);



    }
}
/*
 Create a class named ReallyNeverMind. Ask the user to enter a word.
  if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */