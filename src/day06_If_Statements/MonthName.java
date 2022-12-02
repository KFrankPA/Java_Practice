package day06_If_Statements;

public class MonthName {
    public static void main(String[] args) {

        int num =1;
        String month = "";

if(num == 1){
    month = "January";
}
if(num == 2){
    month = " February";
}
if(num==3){
    System.out.println(num + " March");
}
if(num==4){
    System.out.println(num + " April");
}
if(num == 5){
    System.out.println(num + " May");
}
if(num == 6){
    System.out.println(num + " June");
}
if(num == 7){
    System.out.println(num + " July");
}
if(num == 8){
    System.out.println(num + " August");
}
if(num == 9){
    System.out.println(num + " September");
}
if(num == 10){
    System.out.println(num + " October");
}
if(num == 11){
    System.out.println(num + " November");
}
if(num == 12){
    System.out.println(num + " December");
}
        System.out.println(month);
    }
}
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents

Ex:
Given:
number = 10

output:
October
 */