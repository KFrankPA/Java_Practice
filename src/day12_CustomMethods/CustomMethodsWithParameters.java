package day12_CustomMethods;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        int num1=45;
        oddOrEven(num1);
        oddOrEven(40);

oddOrEven(100);

    }

    public static void oddOrEven (int number){

        if(number % 2 == 0 ){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }


}
