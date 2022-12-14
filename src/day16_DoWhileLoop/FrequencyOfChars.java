package day16_DoWhileLoop;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "aaaaabbbbbaaccddea";
        String result = "";


        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    frequency++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            } else {
                result += ch + "" + frequency + " ";
            }
        }
        System.out.println(result);


    }
}