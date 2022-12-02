package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNames {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));
        // names.removeAll(Arrays.asList("Ahmed"));
        //  System.out.println(names);
        System.out.println("===================");
        ArrayList<String> names2 = new ArrayList<>();
        for (String each : names) {
            if(each.contains("Ahmed")){
            continue;
            }else{
               names2.add(each);
            }
        }
        names = names2;
        System.out.println(names);

    }
}
/*
3. Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];


 */