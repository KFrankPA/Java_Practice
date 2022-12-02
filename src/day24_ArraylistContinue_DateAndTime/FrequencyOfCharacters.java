package day24_ArraylistContinue_DateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbbccccc";
        String result = "";
     for(String each : str.split("")){
       int freq = Collections.frequency(Arrays.asList(str.split("")) , each );
       if(!result.contains(each)){
           result += each + freq;
       }

      }
        System.out.println(result);

    }
}
