package day25_Constructors;

public class SalaryCalculator {
    public double hourlyRate;
    public double weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public SalaryCalculator(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        return weeklyHours * hourlyRate;
    }

    public double totalStateTax (){
      return salary() * stateTaxRate;
    }
    public double totalFederalTax (){
        return salary() * federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary() - totalFederalTax() - totalStateTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=" + salary() +
                ", totalStateTax =" + totalStateTax() +
                ", totalFederalTax=" + totalFederalTax() +
                ", net income=" + salaryAfterTax() +
                '}';
    }

    public static void main(String[] args) {
        SalaryCalculator sal1 = new SalaryCalculator(45, 40,0.06,0.12);
        System.out.println(sal1);
    }
}
/*

Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */