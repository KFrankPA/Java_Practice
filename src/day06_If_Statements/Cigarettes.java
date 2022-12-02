package day06_If_Statements;

public class Cigarettes {

    public static void main(String[] args) {


        int age = 40;

        boolean isEligible = age >= 21;
        System.out.println(isEligible);

        System.out.println("=============");

        if (isEligible) {
            System.out.println("isEligible = ");
        }
        if (!isEligible){
            System.out.println("not eligible");
        }
        if(age>=21){
            System.out.println(" \"if\" eligible");

        }

    }
}
