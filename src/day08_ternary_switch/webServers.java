package day08_ternary_switch;

public class webServers {

    public static void main(String[] args) {

        String statusCode = "";
        int code = 202;


        String result = (code == 200) ? "OK" : (code == 201) ? " Created" : (code == 202) ? " Accepted" : (code == 301) ?
                " Moved Permanently" : (code == 303) ? " See other" : (code == 304) ? " Not modified" : (code == 307) ? " Temporary redirect" : "Invalid";
        System.out.println(result);
        System.out.println("==============================");

        switch (code) {
            case 200:
                System.out.println(" OK");
                break;
            case 201:
                System.out.println(" Created");
                break;
            case 202:
                System.out.println(" Accepted");
                break;
            case 301:
                System.out.println(" Moved permanently");
                break;
            case 303:
                System.out.println(" See other");
                break;
            case 304:
                System.out.println( " Not modified");
                break;
            case 307:
                System.out.println(" Temporary redirect");
            default:
                System.out.println("Invalid");


        }

    }
}
