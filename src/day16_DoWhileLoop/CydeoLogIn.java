package day16_DoWhileLoop;
import java.util.Scanner;
public class CydeoLogIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     System.out.println("enter userName");
       String userName =sc.next();
        System.out.println("enter password");
       String password = sc.next();
        System.out.println();
        int attempts = 0;
        if((userName.equals("Cydeo") && password.equals("Spoon"))) {
            System.out.println("You are logged in");
        }else {
            while (!(userName.equals("Cydeo") && password.equals("Spoon"))) {
                System.out.println("enter userName");
                userName = sc.next();
                System.out.println("Enter a password");
                password = sc.next();
                attempts++;

                if (!userName.equals("Cydeo") && !password.equals("Spoon")) {
                    System.out.println("Try Again");

                }

                if (attempts == 2) {
                    System.out.println("your account is locked");
                    break;

                } else if ((userName.equals("Cydeo") && password.equals("Spoon"))) {
                    System.out.println("You are logged in");
                }
            }
        }

    }
}
