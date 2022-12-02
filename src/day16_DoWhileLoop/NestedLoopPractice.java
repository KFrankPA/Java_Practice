package day16_DoWhileLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {

        String str = "aaaabbbccdddeeff";
        String result = "";
        char ch = '0';
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j); // each character of string str
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if(count == 2 && !result.contains(""+ch)){ // to avoid duplicates
                result += ch;
            }
        }
        System.out.println(result);
    }
}