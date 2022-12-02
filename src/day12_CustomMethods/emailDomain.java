package day12_CustomMethods;

import java.util.Scanner;

public class emailDomain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("email");
        String email = scan.next();

        String domain = email.substring(email.indexOf('@')+1, email.indexOf('.'));
        System.out.println(domain);

    }

}
/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail


 */