package day16_DoWhileLoop;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "aaaaabbbbbaaccddea";
        String result = "";


        for (int i = 0; i <str.length(); i++) {
           // char ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    frequency++;
                }
            }
            if (result.contains("" + str.charAt(i))) {
                continue;
            } else {
                result += str.charAt(i) + "" + frequency + " ";
            }
        }
        System.out.println(result);


    }
}