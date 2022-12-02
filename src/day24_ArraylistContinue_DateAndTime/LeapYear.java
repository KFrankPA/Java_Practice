package day24_ArraylistContinue_DateAndTime;

import java.time.LocalDate;

public class LeapYear {
    public static boolean leapYear(int birthYear){
        return LocalDate.of(birthYear, 1,1).isLeapYear();

    }
}
/*
Create a function that accepts an int argument birthYear,
 return true if the person was born on leap year, otherwise return false
 */