package day20_ArrayContinue;

public class OddAnadEvens {
    public static void main(String[] args) {

        int [] number = {1,2,3,4,5,6,7,8,9,10,22,41};
        int odds=0;
        int evens=0;
        for (int each : number) {
            if(each % 2 == 0){
                evens++;
            }else{
                odds++;
            }
        }
        System.out.println("evens = " + evens + " odds " + odds);
    }
}
/*

2.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */