package day06_If_Statements;

public class netIncomeCalc {

    public static void main(String[] args) {
        double salary = 50000;

        double taxRate = 0;

        boolean married = true;

        if(salary>= 130_000) {
            taxRate = 0.35;
        }
         if(salary >= 100_000 && salary >= 129_000) {
             taxRate = 0.30;
         }
          if(salary>=80_000 && salary <= 99_000){
              taxRate = 0.25;
          }
            if (salary<= 79_000) {
                taxRate = 0.2;
            }
             if( married ){
                 taxRate -= 0.05;
             }
             double netSalary= salary - (salary * taxRate);
        System.out.println(netSalary + " is Net salary");

    }
}
/*
. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */