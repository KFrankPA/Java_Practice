package day12_CustomMethods;

public class EligibleToVote {
    public static void main(String[] args) {

        eligibleToVOte(20);
    }

    public static void eligibleToVOte(int number){

        boolean trueOrFalse = number>=21;
        String result = "";

        if (trueOrFalse == true){
            result = "You are eligible to vote";
        }else{
            result = "You are not eligible to vote";
        }
        System.out.println(result);

    }

}
