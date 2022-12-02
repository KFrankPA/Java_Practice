package day19_Arrays;

public class MinNum {
    public static void main(String[] args) {
        int[] num = {10, 20, 0, 40, -5, 95, 44,};
        int min = num[0];
        for (int i = 1; i < num.length; i++) {

            if(min>num[i]){
                min = num[i];
            }

        }
        System.out.println(min);

    }
}
