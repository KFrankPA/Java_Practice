package day09_scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your score");
        int score = input.nextInt();
        String grade = "";
        String result = "Invalid";

        if (score >= 0 && score <= 100) {
            if (score >90) {
                grade = "A";
            } else if (score >= 80 && score <90) {
                grade = "B";
            } else if (score >= 70 && score < 80) {
                grade = "C";
            } else if (score >= 60 && score < 70) {
                grade ="D";
            } else {
                grade = "F";
            }
        }  else {
            System.out.println(result);
        }

        System.out.println(grade);
        input.close();

    }
}
/*
. Create a class named GradeReport:
            2.1 Ask the user to enter his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 if(score>=90){
                result = "A";
            }else if(score>=80 && score<90){
                result = "B";
            }else if (score>=70 && score<80){
                result = "C";
            }else if (score>=60 && score<70){
                result = "D";
            }else {
                result = "F";
 */