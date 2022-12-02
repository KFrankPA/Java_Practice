package day08_ternary_switch;

public class ifStatementandTernaries {

    public static void main(String[] args) {

       int score = 90;
       String result ="";

       if(score>=0 && score <= 100){

           result = (score >= 90)? "A" : (score>=80)? "B" : (score >= 70) ? "C" : (score >= 60)? "D" : "F";


       }else{
           result =" Invalid score";
       }
        System.out.println(result);
        System.out.println("--------------_________----------------");

        String result2 = (score >= 0 && score <= 100)?
                (score >= 90)? "A" : (score>=80)? "B" : (score >= 70) ? "C" : (score >= 60)? "D" : "F"
                : "Invalid score";
        System.out.println(result2);
    }
}

