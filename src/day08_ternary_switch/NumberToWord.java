package day08_ternary_switch;

public class NumberToWord {
    public static void main(String[] args) {

        int num = 5;
        String word = " Invalid number";

        if (num >= 0 && num <= 9) {
            word = "this " + num + " number is";

            if (num == 1) {
                word += " One";
            } else if (num == 2) {
                word += " Two";

            } else if (num == 3) {
                word += " Three";

            } else if (num == 4) {
                word += " Four";

            } else if (num == 5) {
                word += " Five";

            } else if (num == 6) {
                word += " Six";

            } else if (num == 7) {
                word += " Seven";

            } else if (num == 8) {
                word += " Eight";

            } else {
                word += " Nine";
            }
        } else {
            word = " Invalid number";

        }
        System.out.println(word);
        System.out.println("===========================================");

        String word2 = (num >= 0 && num <= 9) ?
                (num == 0) ? " Zero " : (num == 1) ? " One" : (num == 2) ? "Two" : (num == 3) ? " Three"
                        : (num == 4) ? " Four" : (num == 5) ? " Five" : (num == 6) ? " Six" : (num == 7) ? " Seven"
                        : (num == 8) ? " Eight" : "Nine" : " Invalid number";

        System.out.println(word2);


    }

}
