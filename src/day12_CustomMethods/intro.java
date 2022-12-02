package day12_CustomMethods;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("name");
        String name = scan.nextLine();
        System.out.println("lastName");
        String lastname = scan.nextLine();

        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        lastname = lastname.substring(0,1).toUpperCase() + lastname.substring(1).toLowerCase();
        System.out.println(name + " " +lastname);



    }
}
