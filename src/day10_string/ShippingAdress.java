package day10_string;
import java.util.Scanner;

public class ShippingAdress {
    Scanner scan =new Scanner(System.in);

      public static void main(String[] args) {
        //Enter your code here
          String firstName,
                lastName,
                email,
                street,
                state,
                city;

          int age,
                zipCode;
        double height,
                weight;

        boolean isMarried;
        long workPhoneNumber,
                personalPhoneNumber;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        firstName = scan.next();

        System.out.println("Enter your last name");
         lastName = scan.next();


        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();

        // continue for city
        System.out.println("Enter your city");
        city= scan.nextLine();

        System.out.println("Enter your state");
        state = scan.nextLine();

        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();

        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        age=scan.nextInt();

        System.out.println("Enter your height");
        height =  scan.nextDouble();

        System.out.println("Enter your weight");
        weight =  scan.nextDouble();

        System.out.println("Are you married?");
        isMarried= scan.nextBoolean();

        System.out.println("Patient personal information");

        System.out.println("Full name: " +firstName + " " + lastName);
        System.out.println("Address: " + street + ", " + city +", " + state +" "+ zipCode);
        System.out.println("Contact: work phone number: " +workPhoneNumber+  ", "
                + "personal phone number: "  + personalPhoneNumber +
                ", email: " + email);
            System.out.println("Age: "+ age);
            System.out.println("Height: "+ height);
            System.out.println("Weight: " + weight + " pounds");
            System.out.println("Married: " + isMarried);

scan.close();



    }
}