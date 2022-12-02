package day04_concatenation;

public class SalaryCalculator {
    public static void main(String[] args) {

        String name = "Joshua";
        int hourlyRate = 40,
                weeklyHours = 45,
                salary = hourlyRate * weeklyHours;
        int weeks = 52;
        salary = salary * weeks;
        System.out.println("Hello " + name + "," + "your salary is $ " + salary);

    }

}
/*
1. Create a class named SalaryCalculator.java
2. Declare the following Variables:
1. name
2. hourlyRate
3. weeklyHours
3. Write a program that can calculate the salary, and display the
following info:
Hint: there are 52 weeks in a year
salary = hourlyRate * weeklyHours * 52
Ex:
given data:
name = “Joshua”
hourlyRate = 40
weeklyHours = 45
output:
Hello Joshua, your salary is $ 93600
 */