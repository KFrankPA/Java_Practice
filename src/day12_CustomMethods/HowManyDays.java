package day12_CustomMethods;

public class HowManyDays {
    public static void main(String[] args) {
        daysInMonth(2);

    }
    public static void daysInMonth(int number){

        String result ="";

        if(number>=1 && number <=12) {

            if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12) {
                result = " Month has 31 dAYS";

            } else if (number == 4 || number == 6 || number == 9 || number == 11) {
                result = "mONTH has 30 dayS";

            } else {
                result = "mONTH has 28 days and 29 days in leAP yEARS";
            }
        }else{
            result = "Invalid month nuMBER";
        }
        result = result.substring(0,1).toUpperCase() + result.substring(1).toLowerCase();
        System.out.println(result);

    }


}
