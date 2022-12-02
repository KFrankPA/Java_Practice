package day06_If_Statements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,
                b = 13,
                c = 25;

boolean aIsMedianNumber = (a > b && a < c ) || ( a > c && a < b),
        bIsMedianNumber = ( b > c && b < a ) || ( b > a && b < c),
        cIsMedianNumber = !aIsMedianNumber && !bIsMedianNumber;
        if(aIsMedianNumber){
            System.out.println( a + " a");
        }
            if(bIsMedianNumber){
                System.out.println( b + " b");
                            }
            if(cIsMedianNumber){
                System.out.println( c + " c");
            }

        }
}
/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number


 */