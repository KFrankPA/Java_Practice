package day13_CustomMethods;

public class ReturnStatements {
    public static void main(String[] args) {

        eligible(25);
        System.out.println("---------------------------");

        System.out.println("Test started");
        boolean exit = true;
        if(exit){
            return;
        }
        System.out.println("test1 completed");
        System.out.println("test2 completed");



    }

    public static void eligible(int age){

        if(age < 0 || age > 150){
            System.err.println("Invalid age: " +age );
            return; // exits the method

        }
        if(age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }
    }
    public static int multiplication(int n1, int n2){

        int result = n1 * n2;
        return result; // returns the value when exiting the method

    }


}
