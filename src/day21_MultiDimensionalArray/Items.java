package day21_MultiDimensionalArray;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}  };

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("============================");
        for (String[] eachGroup : items) {
            for (String each : eachGroup) {
                System.out.print(each + "\t");
            }
            System.out.println();
        }
        System.out.println("=========================+++++============================");
        for (String[] eachGroup2 : items) {
            for (int i = eachGroup2.length - 1; i >= 0; i--) {
                System.out.print(eachGroup2[i]+ "\t");
            }
            System.out.println();
        }
        System.out.println("=============||||||||||==============");

        for (int i = items.length - 1; i >= 0; i--) {
            /*for (int i1 = 0; i1 < items.length; i1++) {
                System.out.print(items[i][i1]+"\t");
            }
           */
            String[] newItem = items[i];
            for (String each : newItem) {
                System.out.print(each +"\t");
            }
            System.out.println();
        }




    }
}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado


 */