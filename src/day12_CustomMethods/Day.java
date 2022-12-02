package day12_CustomMethods;

public class Day {
    public static void main(String[] args) {

        day(13);

    }
    public static void day(int number){


        String result ="";
        if(number >=1 && number <=7 ){

            switch (number){
                case 1:
                    result = "Monday";
                    break;
                case 2:
                    result = "Tuesday";
                    break;
                case 3:
                    result = "Wednesday";
                    break;
                case 4:
                    result = "Thursday";
                    break;
                case 5:
                    result = "Friday";
                    break;
                case 6:
                    result = "Saturday";
                    break;
                default:
                    result = "Sunday";
            }
        }else{
            result = "Invalid";
        }
        System.out.println(result);


    }
    /*
    Create a method named day that can display the name of the day based on the given number to the method,
     if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
     */
}
