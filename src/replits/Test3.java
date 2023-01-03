package replits;

public class Test3 {


    public static void main(String[] args) {

        String s = "aa2aa3";

        String[] nums2 = s.split("");
        String result = "";

        for (String each2 : nums2) {
            if (Character.isDigit(Integer.parseInt(each2))) {
                result += each2;
            }
        }
        System.out.println(result);
        }
    }

