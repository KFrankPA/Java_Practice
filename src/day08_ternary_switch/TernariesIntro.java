package day08_ternary_switch;

public class TernariesIntro {

    public static void main(String[] args) {

        int score = 85;
        String result;

        if (score >= 60) {
            result = "Passed";

        } else {
            result = "Failed";
        }

        System.out.println(result);

        System.out.println("====================================");

         String result2 =(score>=60) ? "Passed" : "Failed";
        System.out.println(result2);
        System.out.println("--------------------------------");

        int age = 30;

        String result3 = (age >=21) ? "Eligible" : "Not eligible" ;
        System.out.println(result3);






    }
}
