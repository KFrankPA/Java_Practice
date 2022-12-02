package day07_IfStatements;

public class Gradelevel {
    public static void main(String[] args) {

        byte gradeLvl = 77;
        String result = "";

        if (gradeLvl >= 0 && gradeLvl <= 18) {
            if (gradeLvl >= 1 && gradeLvl <= 5) {
                result = " Elementary school";
            } else if (gradeLvl >= 6 && gradeLvl <= 8) {
                result = " Middle school";
            } else if (gradeLvl >= 9 && gradeLvl <= 12) {
                result = "High school";
            } else if (gradeLvl >= 13 && gradeLvl <= 16) {
                result = "College";
            } else {
                result = " Gradschool";
            }
        }else{
            result= " Invalid";
        }
        System.out.println(result);
    }

}
/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
