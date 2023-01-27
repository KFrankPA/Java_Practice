package oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MuhtarTasks {
    public static void main(String[] args) {

        int a [] = {1,2,3,4,5,6,7,8,9,5};
        System.out.println(firstDuplicatedElement(a));

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {

            }

        }

        String s[] = {"HI", "How", "ARE", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(s));
        if(arrList.removeIf(f ->{
            System.out.print(f); return f.length()<=2;})){
            System.out.println("removed");
        }
        System.out.println(Arrays.asList(s));


    }
    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }

        return firstDuplicated;
    }
    }
