package day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbbcccc";
        String result = ""; // abc

        for (int i = 0; i < str.length(); i++) {

            char ch1 = str.charAt(i);

            if(!result.contains("" + ch1)){ // if the string "result" doesnt contain string str yet
                result += ch1;
            }
        }
        System.out.println(result);

        String ab = "xxxyyyzzzbbb";
        String result2 = "";

        for (int i = 0; i < ab.length(); i++) {
          //char l = ab.charAt(i);
            if(result2.contains("" + ab.charAt(i))){
              continue; // skips the already contained characters
            }
            result2 +=ab.charAt(i);

        }
        System.out.println(result2);





    }
}
