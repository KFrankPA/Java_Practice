package day07_IfStatements;

public class AgeGroups {
    public static void main(String[] args) {

        int age =0;
        String ageResult ="";

        if(age >= 0 || age >=150){
            if(age<21){
                ageResult = " Teenager";

            }else if(age >= 21 && age < 55){
                ageResult = " Adult";

            }else{
                ageResult = " Senior";
            }
        }else{
            ageResult = " are you Alien?";
        }

        System.out.println(ageResult);

    }
}
/*
5. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */