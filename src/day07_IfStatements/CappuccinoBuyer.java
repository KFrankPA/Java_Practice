package day07_IfStatements;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size = "tall";

        double price = 0;

        int calories = 0;
        String result = "";

        if (size == "tall" || size == "grande" || size == "venti") {

            if (size == "tall") {
                price = 3.69;
                calories = 90;
            } else if (size == "grande") {
                price = 3.99;
                calories = 120;
            } else {
                price = 4.29;
                calories = 150;
            }
        } else {
            result = " Invalid";
        }


        System.out.println(result);
        System.out.println("Price is $" + price + "\n" + calories + " calories");
    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given,
 write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:
						tall:
				                price is $3.69
								90 calories
						grande:
								price is $3.99;
								120 calories
						venti:
								price is $4.29
								150 calories
			If the size is invalid then the output should be "Invalid Size"
			Note: MUST use nested if

 */