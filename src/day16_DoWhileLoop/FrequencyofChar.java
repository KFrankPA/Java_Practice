package day16_DoWhileLoop;

public class FrequencyofChar {
    public static void main(String[] args) {

        String str = "aaabbbccc";
        char ch = 'c';

        int count = 0;
        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            if(str.charAt(i) == ch){
                count ++;

            }
        }
        System.out.println(count);
    }

}

/*
 Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char,
  the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */