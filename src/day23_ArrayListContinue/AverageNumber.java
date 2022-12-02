package day23_ArrayListContinue;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        int sum = 0;
        int average = 0;
        for (Integer each : list) {
            sum += each;

        }
        average = sum/ list.size();
        System.out.println(sum);
        System.out.println("average = " + average);


    }
}
