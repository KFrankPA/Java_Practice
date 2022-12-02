package day24_ArraylistContinue_DateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDates {
    public static void main(String[] args) {
        ArrayList<LocalDate> str = new ArrayList<>();
        str.addAll(Arrays.asList(LocalDate.of(2022, 11, 25)));
        str.removeIf(p -> p.isBefore(LocalDate.of(2022, 8, 30)));

    }
}
/*
create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016

 */