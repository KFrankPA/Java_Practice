package day38_Exception_handling;

import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {


        System.out.println("Program1 started");

        Thread.sleep(5000);
        System.out.println("Program1 ended");

        System.out.println("======================================");

        System.out.println("Program2 started");

        Thread.sleep(5000);
        System.out.println("Program2 ended");

        System.out.println("======================================");


    }
}
