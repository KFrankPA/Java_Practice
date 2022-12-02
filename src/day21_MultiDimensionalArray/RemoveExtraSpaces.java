package day21_MultiDimensionalArray;

import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {

        String str = "  Hello world    I    Love    Java   ";

        String [] words = str.split(" ");
        str = "";
        for(String each:words){
            if(!each.isEmpty()){
                str +=each + " ";
            }
        }
        str = str.trim();
        System.out.println(str);
    }
}
