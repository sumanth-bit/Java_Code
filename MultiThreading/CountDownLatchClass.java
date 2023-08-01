package MultiThreading;

import java.util.concurrent.CountDownLatch;

class Example extends Thread{

    private CountDownLatch latch;

    public Example(CountDownLatch latch){
        this.latch = latch;
    }

    public void run(){
        System.out.println("Running Threads "+currentThread().getName());
        latch.countDown();
    }
}

public class CountDownLatchClass {

    public static void main(String args[]){

        CountDownLatch latch = new CountDownLatch(3);
        Example thread1 = new Example(latch);
        Example thread2 = new Example(latch);
        Example thread3 = new Example(latch);
        Example thread4 = new Example(latch);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try{
            latch.await();
        }
        catch(InterruptedException e){
            e.printStackTrace();

        }

        System.out.println("I am in main thread");
    }

}
