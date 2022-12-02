package day06_If_Statements;

public class OxygenTank {

    public static void main(String[] args) {

        int lvl = 60;
        String oxygen = "";
        if (lvl >= 90) {
            oxygen = " Your tank is full";
        }
        if (lvl >= 80 && lvl < 90) {
            oxygen = " Still okay";
        }
        if (lvl >= 70 && lvl < 80) {
            oxygen = " Don't go too far";
        }
        if (lvl >= 60 && lvl < 70) {
            oxygen = " Start to head back";
        }
        if (lvl >=50 && lvl < 60) {
       oxygen = " Be carefull, now you are at 50%";
        }

        System.out.println(oxygen);
    }
}
/*
8. Create a class named OxygenTank. You are diving in the ocean.
 Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at 50%

                USE ONE PRINT STATEMENT ONLY

 */