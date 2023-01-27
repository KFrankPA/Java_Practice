package oca.groupStudy;

public class Test01 {
    public static void main(String[] args) {

        String a = "ABCDEFGABCDEFG";

        String uniques = "";

        for (int i = 0; i < a.length(); i++) {

            if (!uniques.contains("" + a.charAt(i))) {
                uniques +=a.charAt(i);
            }

        }
        System.out.println(uniques);

    }
}
