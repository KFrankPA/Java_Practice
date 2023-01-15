package replits;

import java.util.concurrent.ExecutionException;

public class TestTryCatch {
    public static void main(String[] args) {

        System.out.println("Start message");


        // System.out.println(7/0);
        try{
            System.out.println("Try block - 1");
            //System.out.println(7/0);
            System.out.println("Try block - 2");
        }catch (RuntimeException e) {
            //  System.out.println(7/0);
            System.out.println("Handled - 1");
            //System.out.println(7/0);
            System.out.println("Handled - 2");
        }
        System.out.println("Finished block");


    }
}
