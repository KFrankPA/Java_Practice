package day11_string;

public class StringsMethodsOne {
    public static void main(String[] args) {

        String str1 = "CYdEO SCHOOL";

        str1 = str1.toLowerCase(); //

        System.out.println(str1);

        System.out.println("===============");

        String str2 = "java programming";

        str2 = str2.toUpperCase();
        System.out.println(str2);

        System.out.println("======================");

        String str3 = "        cydeo  school";
        str3 = str3.trim();
        System.out.println(str3);

        System.out.println("============");

        String sentence1 = "Today is Wednesday, and we have a Java class";

        int index1 = sentence1.indexOf('o');
        System.out.println(index1);

        String s1 = "I love Java Programming";

        int firstA = s1.indexOf('g');
        int darozi = s1.length();

        System.out.println(firstA);
        System.out.println(darozi);

        System.out.println("=======================");

        String s2 = "Java Python JavaScript Cydeo";

        int firstlett = s2.indexOf("a Python");
        System.out.println(firstlett);

        int l3 = s2.indexOf('a');
        System.out.println(l3);

        int l4 = s2.indexOf("avaS");
        System.out.println(l4);
        System.out.println("================");

        String w10 = "Java";
        //int i15 = w10.indexOf('l');
        System.out.println(w10.indexOf('a'));
       // System.out.println(i15);
        System.out.println(w10.lastIndexOf('a'));

String word2290 = "I love Python language, Python is the best programming language. Python";
word2290 = word2290.replaceFirst(" Python is", " Java");
        System.out.println(word2290);

        System.out.println("-----------________________________");

        String sentence55 = "I love Python language, Python is the best programming language. Python";
        String subs= sentence55.substring(2,5+1);
        System.out.println(subs);





    }
}
