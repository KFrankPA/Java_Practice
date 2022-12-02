package day06_If_Statements;

public class GradeLevel {

    public static void main(String[] args) {

        int gradelvl = 16;
        if (gradelvl >= 1 && gradelvl <= 5){
            System.out.println(gradelvl + " elementary school");
        }
if (gradelvl >=6 && gradelvl <= 8){
    System.out.println(gradelvl + " middle school");
    }
if (gradelvl >= 9 && gradelvl <= 12){
    System.out.println(gradelvl + " high school");
    }
if (gradelvl >= 13 && gradelvl <= 16){
    System.out.println(gradelvl + " college");
    }
if (gradelvl >= 17 && gradelvl <= 18){
    System.out.println(gradelvl + " gradschool");
}
    }
}
/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write
a program to determine and print which school type someone is in

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

Assume that the given number is 1 ~ 18
 */