package day08_ternary_switch;

public class Ternary_switch {


    public static void main(String[] args) {

        int floorNumber = 3;
        String result = " Invalid floor";

        if (floorNumber >= 1 && floorNumber <= 3) {
            result = "Floor " + floorNumber + " is selected companies:";
            if (floorNumber == 1) {
                result += "lobby, verizon, starbucks";
            } else if (floorNumber == 2) {
                result += " NASA, CYDEO, Intelset";
            } else {
                result += "Lyft, Bota, SteakHouse";
            }
        }
        System.out.println(result);
    }


}
