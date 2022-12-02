package day07_IfStatements;

public class Gradelvl {
    public static void main(String[] args) {

        int gradeLvl = 10;
        String result = "";

        if (gradeLvl <= 18) {
            result = " Elementary school";
        } else if (gradeLvl <= 8) {
            result = " middle school";
        } else if (gradeLvl<= 12){
            result = " High school";
        } else if ( gradeLvl <= 16){
            result = "College";
        } else if (gradeLvl <= 18){
            result = " Grad school";
            result = " wazz up";
        }

        System.out.println(result);
    }
}
/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Note: Assume that the given number is between 1 ~ 18

 */