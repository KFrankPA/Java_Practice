package day16_DoWhileLoop;

import java.util.Scanner;

public class CydeoLogin2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username");
        String usName = sc.next();

        System.out.println("Enter a password");
        String password = sc.next();
        int attempts = 0;
        if (usName.equals("Cydeo") && password.equals("Spoon")) {
            System.out.println("You are logged in");

        } else {
            for (int i = 0; i < 3; i++) {
                // attempts++;
                if (i != 2) {
                    System.err.println("Invalid username or password");
                } else {
                    System.err.println("Invalid username or password");
                    System.err.println("this is your last attempt");
                }
                System.out.println("Enter username");
                usName = sc.next();

                System.out.println("Enter a password");
                password = sc.next();

                if (usName.equals("Cydeo") && password.equals("Spoon")) {
                    System.out.println("You are logged in");
                    break;
                }
               /* }else if (attempts == 1){
                    System.err.println("last attempt");
                }else if(attempts==2){
                    System.out.println("Your account is locked");
                    break;
                }*/

            }

        }
        if (!(usName.equals("Cydeo") && password.equals("Spoon"))) {
            System.err.println("Your account is locked");
        }


    }
}
