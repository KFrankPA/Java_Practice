package day08_ternary_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {

        int number = 100;

        String result = (number > 0) ? " Positive" : (number < 0)? "Negative" : " Zero";

        System.out.println("________________________________________________________");

        int num =18;

        String result1 = (num==1)? "Monday" : (num ==2)? "Tuesday" : (num == 3)? "Wednesday" : (num == 4)? " Thursday"
        : (num == 5)? " Friday" : (num == 6)? " Saturday" : "Sunday";
        System.out.println(result1);
    }
}
