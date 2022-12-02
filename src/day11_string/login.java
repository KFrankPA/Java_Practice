package day11_string;
import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String correctUserName ="Cydeo", // literal
                correctPassword="Wooden spoon"; //literal

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = input.nextLine(); // new

        System.out.println("Enter your password");
        String password = input.nextLine();

        input.close();

        if(username.equals(correctUserName) && password.equals(correctPassword) ){
            System.out.println("You are logged in");
        }else{
            System.out.println("Incorrect username or password. Please try again");
        }
        scan.close();
    }
}
