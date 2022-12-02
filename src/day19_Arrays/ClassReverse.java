package day19_Arrays;

import java.util.Arrays;

public class ClassReverse {
    public static void main(String[] args) {

        String[] classMates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};

       /* for (int i = classMates.length - 1; i >= 0; i--) {
            System.out.print(classMates[i]);
        }*/
        String reverse = "";

        for (int i = 0; i < classMates.length; i++) {

            String names = classMates[i];
            for (int j = names.length() - 1; j >= 0; j--) {
                reverse += names.charAt(j);
            }
        }
        System.out.println(reverse);

        System.out.println("=======================");

        String [] str ={"loohcS", "oedyCnoopS", "nedooWgnimmargorP"};

        String rev2="";
        for (int i = 0; i < str.length; i++) {
            String newStr = str[i];
            for (int j = newStr.length()-1; j >= 0; j--) {
                rev2 += newStr.charAt(j);
            }
        }
        System.out.println(rev2);

        }

}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */