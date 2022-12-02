package day11_string;
import java.util.Scanner;

public class CalledEmailTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter email");
        String email = sc.nextLine();

        // int mail = email.indexOf('@')-1;

      if(email.contains("_")) {
          String firstName= email.substring(0,email.indexOf("_"));
          String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
          String mail = email.substring(email.indexOf("@"));
          System.out.println(lastName+"_" + firstName+mail);
    }else{
            System.out.println("ooops");

        }
sc.close();

}
}

/*String test1 = "My nameis Fakhriddin Kalonov";
String test2 = test1.substring(test1.indexOf('K'), test1.indexOf('o'));
        System.out.println(test2);
        */

/*
Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */