package MultiThreading;

class SynchronizedClass extends Thread{
     String lock1 = "lock1";
     String lock2 = "lock2";

    public void run(){

        synchronized (lock1){
            System.out.println("Thread  "+Thread.currentThread().getName()+" has obtained lock1");
        }
        synchronized(lock2){
            System.out.println("Thread  "+Thread.currentThread().getName()+" has obtained lock2");
        }


    }

}

public class DeadLockSynchonizedLock {

    public static void main(String args[]){

        SynchronizedClass s1 = new SynchronizedClass();
        SynchronizedClass s2 = new SynchronizedClass();
//        s1.setName("1");
//        s1.start();
//        s1.setName("2");
//        s2.start();

//        try {
//            s1.join();
//            s2.join();
//        }
//        catch(InterruptedException e){
//            e.printStackTrace();
//        }
//        System.out.println("Inside Main Method");

        // We will start the actual approach

        String lock1 = "l1";
        String lock2 = "l2";

        Thread thread1 = new Thread(new Runnable(){
            public void run(){
                synchronized (lock1){
                    System.out.println("Inside thread1 on lock 1");

                    synchronized (lock2){
                        System.out.println("Inside thread1 on lock 2");
                    }
                }


            }

        });
        Thread thread2 = new Thread(new Runnable(){
            public void run(){
                synchronized (lock2){
                    System.out.println("Inside thread2 on lock 1");

                    synchronized (lock1){
                        System.out.println("Inside thread2 on lock 2");
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
