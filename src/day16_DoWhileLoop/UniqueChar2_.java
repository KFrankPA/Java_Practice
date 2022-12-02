package day16_DoWhileLoop;

public class UniqueChar2_ {
    public static void main(String[] args) {

        String str = "plaaabccdeeefggh";
        String uniques = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int counts = 0;

            for (int i = 0; i < str.length(); i++) { // checks how many times ch has appeared in str
                if (ch == str.charAt(i)) {          // if the ch has appeared in the string
                    counts++;                      // increase the frequency by 1
                }
            }
            if(counts == 1){
                uniques += ch ;
            }
        }
        System.out.println(uniques);
    }
}