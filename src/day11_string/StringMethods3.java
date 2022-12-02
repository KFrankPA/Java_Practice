package day11_string;

public class StringMethods3 {
    public static void main(String[] args) {

        String word = "word";
        boolean r1 = word.isEmpty();

        System.out.println(r1);

        String str2 ="       ";

        boolean r2 = str2.isEmpty();
        boolean r3 = str2.isBlank();
        System.out.println("Empty= " + r2);
        System.out.println("Blank = " + r3);

        System.out.println("=============================");

        String email = "cydeo@gmail.com";

        boolean isGmail = email.endsWith("gmail");
        boolean yahoo = email.endsWith("yahoo");
        System.out.println("Gmail = " + isGmail);
        System.out.println("yahoo = " + yahoo);

        System.out.println("____________________________");

        String sent1 = "I love Java programming";
         //             012345678910

        String sub1 = sent1.substring(7,10+1);

        System.out.println(sub1);

        int st22 = str2.lastIndexOf(' ');
        System.out.println(str2.length());
        System.out.println(st22);

    }
}
