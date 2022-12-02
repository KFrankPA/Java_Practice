package day12_CustomMethods;

import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("first name");
        String name = scan.next();

        System.out.println("last name");
        String lastName = scan.next();

        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println("name " + name + "\n" + "lastname " + lastName);


    }
}
