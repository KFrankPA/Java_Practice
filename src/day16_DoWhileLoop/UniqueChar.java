package day16_DoWhileLoop;

public class UniqueChar {
    public static void main(String[] args) {

        String str = "aaabbcd";
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { //index of and last index of
                unique += ch;
            }

        }
        System.out.println(unique);
    }
}
