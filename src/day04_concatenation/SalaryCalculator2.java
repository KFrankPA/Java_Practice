package day04_concatenation;

public class SalaryCalculator2 {

    public static void main(String[] args) {

        int hourlyRate = 50,
                weeklyHours = 45,
                stateTaxRate = 6,
                federalTaxRate = 26,
                weeks = 52;


        int salaryBeforeTax = (hourlyRate * weeklyHours) * weeks;

        System.out.println(salaryBeforeTax);

        int federalTax = (int) (0.26 * salaryBeforeTax);
        System.out.println("Federal tax is  " + federalTax);

        int stateTax = (int) (0.06 * salaryBeforeTax);
        System.out.println("State tax is " + stateTax);

        int totalTax = stateTax + federalTax;
        System.out.println( "Total tax is " + totalTax);

        int netIncome = salaryBeforeTax - totalTax;
        System.out.println( "Net income is : " +  netIncome);
    }


}
/*
7. Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

   7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560


 */