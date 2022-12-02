package day12_CustomMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        maxNum(25,45);

        maxNum(30, 78);

        maxNum(45, 65);

        initials ("Fakhriddin", "Kalonov");


    }
    public static void maxNum(double num1, double num2){

        if(num1>num2){
            System.out.println(num1 + " is the maximum number");
        }else if(num1<num2){
            System.out.println(num2 + " is the maximum number");

        }else{
            System.out.println("Equal");
        }
    }

    public static void initials(String firstName, String lastName){

        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println("initial is: " + initials);
    }
}
