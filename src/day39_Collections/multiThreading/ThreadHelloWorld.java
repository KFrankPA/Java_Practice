package day39_Collections.multiThreading;

public class ThreadHelloWorld extends Thread{

int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
       for (int i = 0; i < 6; i++) {
           try {
               Thread.sleep(300);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println("Hello world, Thread number " +threadNumber + " iteration number " + i);
       }
            
        }
    }

