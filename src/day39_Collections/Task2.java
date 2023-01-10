package day39_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {

       List<Integer> number = new ArrayList<>();

       number.addAll(Arrays.asList(10,20,20,30,40,5,0,5,0,10,2,0,50,3,0,55,5,47,85));

        System.out.println(new TreeSet<>(number));


}
}

