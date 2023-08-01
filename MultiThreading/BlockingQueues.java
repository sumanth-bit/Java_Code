package MultiThreading;
import java.util.*;
import java.util.concurrent.*;
// This is to Demonstrate Thread Safe Collection Item which is BlockingQueues
// Using producer consumer problem

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    public Producer(BlockingQueue<Integer> q){
        this.queue = q;
    }

    public void run(){
       while(true){
            try {
                System.out.println("Producer has started Started ");
                //Thread.sleep(5000);
                System.out.println("Inserting");
                queue.put(BlockingQueues.counter++);
                System.out.println("After adding value of  counter is" + BlockingQueues.counter);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

       }
    }

}

class Consumer implements Runnable{
     private BlockingQueue<Integer> queue;
     public Consumer(BlockingQueue<Integer> queue){
         this.queue = queue;
     }

     public void run() {

         while (true) {
             try {
                 System.out.println("Consumer has started");
                 Thread.sleep(1000);
                 System.out.println("Removing");

                 queue.take();
                 BlockingQueues.counter--;

                 System.out.println("After removing value of counter is" + BlockingQueues.counter);

             }
             catch (InterruptedException e){
                 e.printStackTrace();
             }

        }
     }
}





public class BlockingQueues {
    public static int counter = 0;
    public static void main(String args[]){
        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(q);
        Thread t1 = new Thread(producer);

        Consumer consumer = new Consumer(q);
        Thread t2 = new Thread(consumer);


        t1.start();
        t2.start();

    }
}
