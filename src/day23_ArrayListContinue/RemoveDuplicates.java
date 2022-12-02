package day23_ArrayListContinue;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Jeniffer");
        names.add("Dima");
        names.add("Hasan");
        names.add("Fatma");
        names.add("Maria");
        names.add("Fatma");

        ArrayList<String> nonDup = new ArrayList<>();
        for (String each : names) {
            if (!nonDup.contains(each)) {
                nonDup.add(each);
            }

        }
        names = nonDup; // by reassigning we will put make original names string eligible for garbage collection
        System.out.println(names);
    }
}