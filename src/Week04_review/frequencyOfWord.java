package Week04_review;

public class frequencyOfWord {
    public static void main(String[] args) {

        String sentence = " Java Java Java Java  Python C# Ruby C++ Swift";

        int originalLength = sentence.length();

        System.out.println(originalLength);

        String temp = sentence.replace("Java", "abc");

        int newLength = temp.length();

        System.out.println(sentence);
        System.out.println(temp);

        System.out.println(originalLength);
        System.out.println(newLength);
        int frequencyOfJava = originalLength - newLength;

        System.out.println("frequencyOfJava= "  + frequencyOfJava);


    }
}
