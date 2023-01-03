package day38_Exception_handling;

public class ThrowsKeyword2 {

    public static void main(String[] args) {


    }



    public static void pauseFor5Seconds() throws InterruptedException{

        Thread.sleep(5000);
    }

    public static void method2() throws InterruptedException {

        System.out.println("Hello World");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");


    }

}
