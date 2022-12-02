package day06_If_Statements;

public class singleIfstatementPractice {
    public static void main(String[] args) {

        int num = 10;
        boolean evenNumber = num % 2 == 0;

        if (evenNumber) {
            System.out.println(" Even ");
        }
        if(!evenNumber){
            System.out.println("odd number");

        }


    }

}
