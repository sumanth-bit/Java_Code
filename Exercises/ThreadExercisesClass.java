//Great Article: https://www.artima.com/insidejvm/ed2/threadsynchP.html

/*
1. The reason for getting Illegal Monitor Exception is you are trying to get Lock() on String object which is cool
2. You are trying to release lock by wait() method using this(current object)  which is actually
3. Not at all been locked and Thread T1 is owner of the lock of that This object.
4. Here we got Exception on notify() method which helps to acquire lock but which is no this(current object),
5. i.e. Your monitor does not have permission to aquire lock on lock of This() object since
6. Synchronized  expression yielded a reference to another object i.e. String
7. So you get Illegal Monitor Execption()

 */

/*
1. Process flow is if we use this
2.you aquire lock on lock() object and Enters the monitor Sections completes execution and release lock and
3. Notify any thread is waiting
4.Here we release lock in second Iteration at the wait() method
5. Once you release Thread -2 will start picking up the execution continues it's flow and Notify that I'm done
and also release the Lock by waiting.
6. Read Clearly, Try to understand it's a good concept.

 */
package Exercises;
class EvenOddPrint {
    public static Object lock =  new Object();
    public static boolean isEven = true;
    public void evenNumber() {
        boolean str = false;
        for (int i = 0; i <= 20; i++) {
            synchronized (lock) // if I put this reference it's working fine
            {
                while (!isEven) {
                    try {
                        System.out.println("Thread 0 is waiting");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (i % 2 == 0) {
                    System.out.println("Even Thread and my even number is  " + i);
                    isEven = false;
                    lock.notify();
                }
            }
        }
    }

    public void oddNumber() {
        boolean str = false;
        for (int i = 0; i <= 20; i++) {
            synchronized (lock)
            {
                while (isEven) {
                    try {
                        System.out.println("Thread 1 is waiting");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (i % 2 != 0) {
                    System.out.println("Odd thread and my Odd number is " + i);
                    isEven = true;
                    lock.notify();
                }
            }
        }
    }
}

public class ThreadExercisesClass {
    public static void main(String args[]) throws InterruptedException {
        EvenOddPrint e1 = new EvenOddPrint();
        EvenOddPrint e2 = new EvenOddPrint();
        //e2.isEven = false;
        Thread t1 = new Thread(() -> e1.evenNumber());
        Thread t2 = new Thread(() -> e2.oddNumber());
        t1.start();
        t2.start();
    }
}
