package day20_ArrayContinue;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shoppingList = "SHOPPING LIST:\n";
        String answer = "yes";
        int itemN = 0;
        int itemCount = 0;
        String itemName = "";
        double itemPrice = 0;
        double itemtotal = 0;
        double shoppingTotal = 0;
        while (answer.equals("yes")) {
            itemN ++;
            System.out.println("Enter the name of item " + itemN);
            itemName = sc.next();
            System.out.println("Enter the price of the " + itemName);
            itemPrice = sc.nextDouble();
            System.out.println("How many " + itemName + " will you buy?");
            itemCount = sc.nextInt();
            itemtotal += itemCount * itemPrice;
            shoppingList += itemName  + " x " + itemCount + " - $" + (itemPrice * itemCount) + "\n";
            System.out.println("Do you want to add more items to the shopping list?");
            answer = sc.next().toLowerCase();
        }
        System.out.println(shoppingList + "Total cost: " + itemtotal);

    }
}

