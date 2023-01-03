package day39_Collections;

public class ThreadHelloWorld extends Thread{

    @Override
    public void run() {
       for (int i = 0; i < 6; i++) {
           System.out.println("Hello world " +i);
           System.out.println("Tuesday");
       }
            
        }
    }

