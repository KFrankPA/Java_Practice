package day16_DoWhileLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            double price;
            System.out.println("Which room do you want to reserve?");
            String rooms = sc.nextLine().toLowerCase();
            while(!((rooms.equals("king bed")) ||(rooms.equals("queen bed")) || (rooms.equals("single bed")) )){
                System.err.println("Invalid entry!");
                System.out.println("Please enter Which room do you want to reserve?");
                rooms = sc.nextLine().toLowerCase();
            }

            if(rooms.equals("king bed ")) {
            price = 120;
        }else if(rooms.equals("queen bed")) {
                price = 100;
            }else{
                price = 80;
        }
        System.out.println(rooms + " " + price);
    }
}
/*
Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

                If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */