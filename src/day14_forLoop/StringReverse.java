package day14_forLoop;

public class StringReverse {
    public static void main(String[] args) {

        String str = "Fakhriddin";
        //0123

        String reverse = "";

        for (int i = str.length()-1 ; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println(reverse);
    }

    public static String reverse(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        return reverse;
    }
}
