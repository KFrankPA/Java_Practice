package day19_Arrays;

public class StudentGrade {
    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];
        int scores2 = 0;


        for (int i = 0; i < names.length; i++) {

            scores2 = scores[i];
            int score = scores[i];
            if (score >= 90) {
                grades[i] = 'A';
            } else if (score >= 80) {
                grades[i] = 'B';
            } else if (score >= 70) {
                grades[i] = 'C';
            } else if (score >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }

            System.out.println(names[i] + "'s score is " + score + ", and grade is " + grades[i]);
        }
        System.out.println(grades);
    }
}


/*
 given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each student's in separate lines
         		Ex:
         			Anna's score is 90, and grade is A

 */