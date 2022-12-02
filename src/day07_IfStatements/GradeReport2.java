package day07_IfStatements;

public class GradeReport2 {
    public static void main(String[] args) {

        int score = 100;
        String result = "";

        if(score > 90){
            result = " Your grade is \"A\"";
        }else{
            result = " You are failed";
        }
        System.out.println(result);
    }
}
/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student

Ex:

score = 95

output:
Your grade is A

Note: Assume that the given score is between 0 ~ 100
 */