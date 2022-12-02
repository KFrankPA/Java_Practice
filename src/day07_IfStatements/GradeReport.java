package day07_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int age = 2;
        String result = "";


        if(age >= 0 && age <= 110 ){

            if (age <= 2) {
                result = "infant";
            } else if (age <= 5) {
                result = "toddler";
            } else if (age <= 9) {
                result = "kid";
            } else if (age <= 12) {
                result = "Pre Teen";
            } else if (age <= 20) {
                result = " Young adult";
            } else if (age <= 39) {
                result = " adult";
            } else if (age <= 49) {
                result = " young middle aged adult";
            } else {
                result = " old man";
            }
        }else{
            result = " Invalid age";
        }

            System.out.println(result);


        }
    }
/*
                       infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */

