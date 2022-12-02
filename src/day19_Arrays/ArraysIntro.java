package day19_Arrays;
import java.util.Arrays;
public class ArraysIntro {
    public static void main(String[] args) {

        int[] scores = new int[5]; // index 0 ~ 4


        scores[2] = 20;
        scores[0] = 5;
        scores[1] = 10;
        scores[3] = 30;
        scores[4] = 40;

        System.out.println(Arrays.toString(scores));
        System.out.println(scores[2]);


        System.out.println("=================================");

        for (int i = 0; i < scores.length; i++) { //i : index of numbers of scores array
            System.out.println(scores[i]);
        }
        System.out.println("=======================================");

        System.out.println(scores[scores.length-1]);





    }
}
