package day17_CustomClassClassAndObjects;
import java.util.Scanner;
public class CustomClassIntro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();


        //WRITE YOUR CODE BELOW
        boolean tF=false;
        String pref = str.substring(0, n);
        str = str.substring(0);
        if (str.contains(pref)) {
            tF = true;

        }else{
            tF=false;
        }
        System.out.println(tF);

        }
    }
