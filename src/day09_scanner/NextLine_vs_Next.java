package day09_scanner;
import java.util.Scanner;
public class NextLine_vs_Next {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

       // input.nextLine(); // Enter

        System.out.println("Enter your fullname: ");
        String fullName = input.nextLine();

        System.out.println("age: " + age);
        System.out.println("fullName: " + fullName);



input.close();





    }
}
