package MultiThreading;

public class JoinMethodClass {

    public int counter = 0;
    public static void main(String args[]) throws InterruptedException {
        JoinMethodClass j = new JoinMethodClass();

        Thread t1 = new Thread(new Runnable(){
            public void run(){
                for(int i = 0; i< 1000; i++){
                    j.counter++;
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){


            public void run(){
                try {
                    t1.join(); // thread2 will wait till thread1 completes it execution
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for(int i = 0;i < 1000; i++){
                    j.counter ++;
                }


            }

        });

        t1.start();
        t2.start();

        t2.join();
        /* join() makes the current thread it is in, to wait till the referrenced thread
           completes  it's execution.
           This will throw interrupted Exception so better to maintain try catch
           It gives proper level of synchronization


         */
        System.out.println("The value of count is "+j.counter);
    }
}
