package day09_scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours do you work in a week");
        double hoursPerWeek = input.nextDouble();

        System.out.println("Enter the State Tax rate");
        double stateTaxRate = input.nextDouble();

        System.out.println("Enter the Federal Tax rate");
        double federalTaxRate = input.nextDouble();

        double salary = 0,
                stateTaxMoney = 0,
                federalTaxMoney = 0,
                totalTax = 0,
                netIncome = 0;


        if (hourlyRate >= 0 && hourlyRate > 0 && stateTaxRate >= 0 && federalTaxRate >= 0) {


            salary = hourlyRate * hoursPerWeek;
            stateTaxMoney = salary * (stateTaxRate / 100);
            federalTaxMoney = salary * (federalTaxRate / 100);
            totalTax = stateTaxMoney + federalTaxMoney;
            netIncome = salary - totalTax;
            System.out.println("Salary " + salary+"\nState tax " + stateTaxMoney + "\nFederal tax "+ federalTaxMoney
            + "\nTotal tax " + totalTax + "\nNet income " + netIncome);


        } else {
            System.out.println("Invalid");
        }
        System.out.println("StateTax" + stateTaxMoney + " federal tax = " + federalTaxMoney + " total tax =+ totalTax +" +
                "Net income" + netIncome);

input.close();
    }
}
/*
Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */