package day21_MultiDimensionalArray;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class removeExtraSpaces1 {
    public static void main(String[] args) {
        String str = "   Hello world     I     Love     Java";

        String [] arrStr = str.split(" ");
        System.out.println(Arrays.toString(arrStr));
        str = "";
        for (String each : arrStr) {
            if(!each.isEmpty())
            str += each + " ";
        }
        System.out.println(str);
    }
}
