package day15_whileLoop;

public class Uniquecharacters {
    public static void main(String[] args) {


            String str = "aabcccd";

            String unique = "";

            for (int i = 0; i < str.length(); i++) { // i: index numbers of str
                char each = str.charAt(i);

                if(str.indexOf(each) == str.lastIndexOf(each)  ){
                    unique += each;
                }

            }


            System.out.println(unique);

        }

    }
/*
Create a class called UniqueCharacters, Write a program that can return the unique characters from a String
	            Ex:
	                input:
	                    AABCCD
	                output:
	                    BD
	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique
 */