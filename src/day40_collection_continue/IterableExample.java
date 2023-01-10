package day40_collection_continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,4,5,6,7,8,9,10,12,15,18,20));

        list.removeIf(p -> p < 5);

        System.out.println(list);

        for (Integer each : list) {


        }


    }
}
