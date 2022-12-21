package replits;
import static day32_Final_keyword.person.Person.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;

public class countFrequency {

    public int age;
    public String name;
    public double price;

    public countFrequency(){
        System.out.println("Hi");
    }

 public countFrequency(String name){
        this();
        this.name = name;
 }
 public countFrequency(String name,double price){
       // this(name);
        this.price = price;
 }
 public countFrequency(int age){

 }


    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1990,05,25);
        System.out.println(birthday);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/y");
        System.out.println(df.format(birthday));

        LocalTime today = LocalTime.now();
        System.out.println(today);

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("h : mm : ss a");
        System.out.println(df2.format(today));
        System.out.println(numberOfHeads);
    }

}
