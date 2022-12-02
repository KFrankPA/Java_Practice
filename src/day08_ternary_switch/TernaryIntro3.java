package day08_ternary_switch;

public class TernaryIntro3 {

    public static void main(String[] args) {

        int score = 1000;


        String result = (score>=0 && score <=100)?
                (score >= 60)? "Passed" : "Failed"
                : "Invalid";
        System.out.println(result);
        System.out.println("_______________________________");

        int num = 6;

        String day = (num >= 0 && num <= 7)?
        (num ==1)? "Monday" : (num == 2)? "Tuesday" : (num==3)? " Wednesday" : (num==4)? "Thursday" : (num==5)?
                "Friday" : (num == 6)? "Saturday" :  "Sunday"
        : "No such day";

                System.out.println(day);

    }
}
