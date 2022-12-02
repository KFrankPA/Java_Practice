package day08_ternary_switch;

public class SwitchIntro {

    public static void main(String[] args) {
        char grade = 'L';
        String result = "";
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            if (grade == 'A') {
                result = " execellent";
            } else if (grade == 'B') {
                result = " great job";
            } else if (grade == 'C') {
                result = " good";
            } else if (grade == 'D') {
                result = " passed";
            } else {
                result = " you failed";
            }
        } else {
            result = " imvalid";
        }
        System.out.println(result);

        System.out.println("================================");

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                break;
            default:
                System.out.println(" Invalid");


        }




    }
}
