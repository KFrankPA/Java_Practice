package day13_CustomMethods;

import java.util.Scanner;

public class ReturnMethodsPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int number = 200;
        System.out.println(isOdd(100));


        if(isEven(number)){
            System.out.println(number + " is even number");

        }else{
            System.out.println(number + " is odd number");
        }
        System.out.println("enter 2 numbers");
        int n1 =scan.nextInt(),
                n2 = scan.nextInt();
       // maxNumber(n1,n2);
        System.out.println(maxNumber(n1, n2));







    }

    public static boolean isOdd(int num){

      // return (num % 2 != 0)? true: false;

        if(num % 2 != 0){
            return true;
        }else{
            return false;
        }




    }
    public static boolean isEven(int num){

        //return !isOdd(num);
        return (num %2 == 0)? true: false;
    }

    public static int maxNumber (int num1, int num2){

        // return num1>num2 ? num1 : num2;

        if(num1 > num2){
            return num1;
        }
        return num2;



    }

}
