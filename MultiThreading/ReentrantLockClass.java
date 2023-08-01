package MultiThreading;
/* When multiple threads are accessing a single item then
inconsistency is produced, to avoid it we can use Synchronized usage
or we can use Reentrant lock,
1. this Locks the code and allows only 1 thread to execute on it a
2. A frees the code when we unlock
3. unlock method must be done in Finally block So if any exception occurs
4. we might not lock the code forever.
 */

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockClass {
    public int counter1 = 0;
    public int counter2 = 0;
    public static ReentrantLock Lock = new ReentrantLock();
    public static void main(String args[]) throws InterruptedException{
        ReentrantLockClass r = new ReentrantLockClass();
        Thread t1= new Thread(new Runnable(){

            public void run() {
                Lock.lock();
                System.out.println(" Lock applied first to Thread 1");
              try{
                    for (int i = 0; i < 1000; i++) {
                        r.counter1++;
                        r.counter2++;
                    }
                }
              finally{
                  System.out.println(" UnLock applied first to Thread 1");
                  Lock.unlock();
                }
            }
        });
        Thread t2= new Thread(new Runnable(){
            public void run() {
                Lock.lock();
                System.out.println(" Lock applied first to Thread 2");
                try{
                    for (int i = 0; i < 1000; i++) {
                        r.counter1++;
                        r.counter2++;
                    }
                }
                finally{
                    System.out.println(" UnLock applied first to Thread 2`");
                    Lock.unlock();
                }
            }


        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Hello  value of counter is "+r.counter1 + " "+r.counter2);

    }

}
