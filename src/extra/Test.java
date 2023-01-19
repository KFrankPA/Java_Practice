package extra;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {


        Predicate<Integer> isOdd = a ->  {
            if(a % 2 != 0){
                return true;
            }else{
                return false;
            }  };

        boolean r1 = isOdd.test(3);
        System.out.println(r1);

        System.out.println("----------------------");


        Predicate <String> isPalindrome = a -> {

            String reverse = "";

            for(int i = a.length()-1; i >= 0 ; i -- ){
                reverse += a.charAt(i);
            }
            return a.equalsIgnoreCase(reverse);

        };

        System.out.println( isPalindrome.test("HIH") );

    }
}
