package MultiThreading;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockUsingReentrantLock {

    public static void main(String args[]){
        ReentrantLock Lock1 = new ReentrantLock();
        ReentrantLock Lock2 = new ReentrantLock();


        Thread thread1 = new Thread(new Runnable(){
            public void run(){
                try {
                    Lock1.lock();
                    System.out.println("Inside thread1 on lock 1");
                    Lock2.lock();
                    System.out.println("Inside thread1 on lock 2");

                }
                finally {
                    Lock1.unlock();
                    Lock2.unlock();
                }


            }




        });
        Thread thread2 = new Thread(new Runnable(){
            public void run(){
                try {
                    Lock2.lock();
                    System.out.println("Inside thread2 on lock 1");
                    Lock1.lock();
                    System.out.println("Inside thread2 on lock 2");
                }
                finally {
                    Lock1.unlock();
                    Lock2.unlock();
                }

            }


        });

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Inside Main Method");


    }
}



