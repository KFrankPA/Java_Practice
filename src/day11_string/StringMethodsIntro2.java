package day11_string;

public class StringMethodsIntro2 {
    public static void main(String[] args) {

        String sentence55 = "I love Python language, Python is the best programming language. Python";
        String subs = sentence55.substring(2, 5 + 1);
        System.out.println(subs);

        System.out.println("------------------------------------");

        String sentence1 = "Today is Thursday, Tomorrow is Saturday";

        String sentence11 = sentence1.substring(9, 16 + 1);
        System.out.println(sentence11);

        System.out.println("=======================================");

        String email = "CydeoSchool.Programming@gmail.com";
        int email11 = email.indexOf('@')+1;
        int email222 = email.lastIndexOf('.'); //helps get gmail till '.'

        String domain = email.substring(email11, email222); // just for gmail
        System.out.println(domain);

        String sentence2= "Today is Sunday, Tomorrow is Monday";

        int sentence2int = sentence2.indexOf('S');

       int sentencelast = sentence2.lastIndexOf('s')+1;

       String Tomorrow = sentence2.substring(sentence2int,sentencelast);
       System.out.println(sentence2int + sentencelast);

       String str999 ="Python";
       String result666 = str999.repeat(10);
        System.out.println(result666);


    }
}
