package day11_string;
import java.util.Scanner;
public class EmailTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = sc.nextLine();

        String firstname = email.substring(0, email.indexOf("_"));

        firstname = firstname.substring(0,1).toUpperCase() + firstname.substring(1).toLowerCase();

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));

        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("name =" +firstname + "\nlast nmae = " + lastName + "\ndomain = " + domain);
//fakhriddin_kalonov@gmail.com
        sc.close();
    }
}
/*
Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */