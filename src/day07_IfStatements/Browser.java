package day07_IfStatements;

public class Browser {
    public static void main(String[] args) {


        String brName = "edgeg";
        String brSelected = " browser is selected";
        String browser = "";

        if (brName == "chrome" || brName == "firefox" || brName == "opera" || brName == "safari" || brName == "edge") {

            if (brName == "chrome") {
                browser = "chrome";
            } else if (brName == "firefox") {
                browser = " firefox";
            } else if (brName == "opera") {
                browser = " opera";
            } else if (brName == " safari") {
                browser = " safari";
            } else {
                browser = "edge";
            }

            } else {
                browser = "invalid browser";


            }
        System.out.println(browser + " Browser is selected");

        }

    }


/*
 if (brName == "chrome") {
                browser = "chrome";
            } else if (brName == " firefox") {
                browser = " firefox";
            } else if (brName == "opera") {
                browser = " opera";
            } else if (brName == " safari") {
                browser = " safari";
            } else {
                browser = "edge";
            } else {
               browser = "invalid browser";
            }
        }
        System.out.println(browser + " Browser is selected

Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name
        Ex:
            String browser = "chrome";
        Output:
            Chrome Browser is selected
        Note: MUST use nested if

 */
