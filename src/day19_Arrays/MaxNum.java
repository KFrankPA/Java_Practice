package day19_Arrays;

public class MaxNum {
    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};
        
        int max = numbers[0]; // assume that index 0-(100) is max number

        for (int i = 1; i < numbers.length; i++) {

            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println(max);


    }
}
