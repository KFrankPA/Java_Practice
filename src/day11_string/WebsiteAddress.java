package day11_string;
import java.util.Scanner;
public class WebsiteAddress {
    public static void main(String[] args) {

        String domain = "www";
        String com = ".com", edu = ".edu", gov = ".gov";

        Scanner cydeo = new Scanner(System.in);

        System.out.println("Enter your website");
        String website = cydeo.nextLine();

       /* boolean startsWith = website.startsWith("www"),
                endsWith = website.endsWith(".com"),
        endsWith2= website.endsWith(".edu"),
                endsWith3=website.endsWith(".gov");
        */
        if ((website.startsWith("www")) && ( website.endsWith(".edu") || website.endsWith(".com") || website.endsWith(".gov"))) {
            System.out.println("Welcome to " + website + " website");
        } else {
            System.out.println("Sorry page not found 404");
        }




    }
}

/*
1. Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
            public class WebSiteAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your website address");
        String webSiteAddress = scan.nextLine();
        boolean starts = webSiteAddress.startsWith("www");
        boolean ends = webSiteAddress.endsWith(".com");
        boolean ends2 = webSiteAddress.endsWith(".edu");
        boolean ends3 = webSiteAddress.endsWith(".gov");
        if (starts == true && ends == true || ends2 == true || ends3 == true) {
            ;
            System.out.println("Web site address is valid");


        } else {
            System.out.println("Invalid web site address");


 */