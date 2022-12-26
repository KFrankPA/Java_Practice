package replits;
import java.util.*;
public class fgdg {

    public static void main(String[] args) {

        int[] nums = {13, 1, 2, 2, 1, 13};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
                continue;
            }else{
                sum +=nums[i];
            }


        }
        System.out.println(sum);

        int a =150;
        String ab = String.valueOf(a);
        System.out.println(ab);
        char[] b = ab.toCharArray();
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
        }
        System.out.println();



    }
}


