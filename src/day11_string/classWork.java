package day11_string;

public class classWork {
    public static void main(String[] args) {

        String email = "myemailisthebestemail@gmail.com";

        int beginning = email.indexOf('@') + 1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);
        System.out.println(domain);

        String sent9 = "Today i Sunday, Tomorrow is Monday";

        String sent00 = sent9.substring(sent9.lastIndexOf(' ') + 1);
        System.out.println(sent00);
        String sen654 = sent9.substring(sent9.indexOf(", ")+2);
        System.out.println(sen654);
        String repeeet= (sen654 + "\n" ).repeat(3);
        System.out.println(repeeet);
        String apu = "My iphone model is 11, and i really like my phone\" urAaaaa\" ";
        boolean trueorfalse = apu.toLowerCase().contains("uraaaaa");
        System.out.println(trueorfalse);
    }
}
