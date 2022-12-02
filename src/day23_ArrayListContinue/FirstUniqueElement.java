package day23_ArrayListContinue;

import day19_Arrays.ArraysLiterals;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        for (Integer eachElement : list) {
            int frequency = 0;
            for (Integer each : list) {
                if(each==eachElement){
                    frequency++;
                }
            }
            if(frequency == 1){

                System.out.println("first unique element " + eachElement);
                break;
            }
        }


    }
}
