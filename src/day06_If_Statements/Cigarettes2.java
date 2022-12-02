package day06_If_Statements;

public class Cigarettes2 {
    public static void main(String[] args) {


        int num = 25;
        if (num>21 && num < 100){ // older than 21, less than 100
            System.out.println("eligible");
        }
        if (num < 21 || num> 100){ // less than 21 , older than 100
                     System.out.println("not eligible");
        }


    }
}