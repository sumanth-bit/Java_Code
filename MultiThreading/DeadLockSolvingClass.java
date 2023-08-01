package MultiThreading;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockSolvingClass {

    public static void main(String args[]){
        ReentrantLock Lock1 = new ReentrantLock();
        ReentrantLock Lock2 = new ReentrantLock();


        Thread thread1 = new Thread(new Runnable() {
            public void run() {

                boolean lockflag1 = false;
                boolean lockflag2 = false;
                boolean doneFlag1 = false;
                boolean doneFlag2 = false;

                while (true) {
                    try {
                        if(!lockflag1) {
                            lockflag1 = Lock1.tryLock();
                        }
                        if(!lockflag2) {
                            lockflag2 = Lock2.tryLock();
                        }

                    } finally {
                      if(lockflag1 && !doneFlag1){
                          System.out.println("Inside thread1 on lock 1");
                          Lock1.unlock();
                          doneFlag1 = true;

                      }
                        if(lockflag2 && !doneFlag2){
                            System.out.println("Inside thread1 on lock 2");
                            Lock2.unlock();
                            doneFlag2 = true;

                        }

                        if(lockflag1 && lockflag2){
                            break;

                        }

                    }


                }
            }


        });
        Thread thread2 = new Thread(new Runnable(){
            public void run() {
                boolean lockflag1 = false;
                boolean lockflag2 = false;
                boolean doneFlag1 = false;
                boolean doneFlag2 = false;

                while (true) {
                    try {
                        if(!lockflag1) {
                            lockflag1 = Lock2.tryLock();
                        }
                        if(!lockflag2) {
                            lockflag2 = Lock1.tryLock();
                        }

                    } finally {
                        if (lockflag1 && !doneFlag1) {
                            System.out.println("Inside thread 2 on lock 2");
                            Lock2.unlock();
                            doneFlag1 = true;

                        }
                        if (lockflag2 && !doneFlag2) {
                            System.out.println("Inside thread 2 on lock 1");
                            Lock1.unlock();
                            doneFlag2 = true;

                        }

                        if (lockflag1 && lockflag2) {
                            break;

                        }

                    }


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



