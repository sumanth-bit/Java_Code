package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
    private String name;
     public SomeThread(String name){
         this.name = name;

     }
     public void run(){
         System.out.println("this "+name+" has started execution");
         try{
             sleep(2000);
         }
         catch(InterruptedException e){
             e.printStackTrace();

         }

         System.out.println("this "+name+" has ended execution");


     }


}


public class ThreadPoolsClass {

    public static void main(String args[]){

        ExecutorService es = Executors.newFixedThreadPool(2);
        SomeThread t1 = new SomeThread("Thread1");
        SomeThread t2 = new SomeThread("Thread2");
        SomeThread t3 = new SomeThread("Thread3");
        SomeThread t4 = new SomeThread("Thread4");
        SomeThread t5 = new SomeThread("Thread5");
        SomeThread t6 = new SomeThread("Thread6");


        es.execute(t1);
        es.execute(t2);
        es.execute(t3);
        es.execute(t4);
        es.execute(t5);
        es.execute(t6);

        /* It can execute any counter threads
         Forget about prints execute the start() method you will understand the difference
         */

//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();

        es.shutdown();



    }

}
