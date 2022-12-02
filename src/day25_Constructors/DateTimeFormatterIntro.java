package day25_Constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("y/MMM/dd");
        System.out.println(today.format(df));

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("MMM/dd/y, EEEE");
        System.out.println(today.format(df2));

        LocalDate tomorrow = LocalDate.of(2022, 11, 28);
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("E, MMM/dd/y");
        System.out.println(tomorrow.format(df3));

        System.out.println("=======================");

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime sunday = LocalTime.now();
        System.out.println(sunday.format(tf));
        System.out.println("========================");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/y  hh:mm a");
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts.format(dtf));

        LocalDateTime today2 = LocalDateTime.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        System.out.println(today2.format(dtf2));

    }
}
