package MultiThreading;

class Bank{

    private int balance;

    public Bank(int bal){
        balance = bal;

    }

    public void withdraw(int amount) {
        if (balance < amount) {
            synchronized (this) {
                try {
                    System.out.println("Amount is less, Wait for Depositing of Money current balance " + balance);
                    /* Try to put only wait() method or any print statement in synchronized
                    block otherwise we will get exception which are run time
                    wait()
                    wait(time)
                    wait(time,thread) different methods
                     */
                    wait();

                } catch (InterruptedException e) {
                    balance = balance - amount;
                    System.out.println("Amount has been deduced current balance is " + balance);
                }
            }
        }

        }


    public void deposit(int amount) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        balance = balance + amount;
        System.out.println("Money has been added current balance is " + balance);
    }



    }




public class InterruptMethodClass {

    public static void main(String args[]){
        Bank b = new Bank(500);

        Thread thread1 = new Thread(new Runnable(){
            public void run(){
                System.out.println("Thread 1");
                b.withdraw(100);
            }

        });

        Thread thread2 = new Thread(new Runnable(){
            public void run(){

                System.out.println("Thread 2");
                b.deposit(500);
                synchronized(this){
                    /* We need to call interrupt() method with thread which is waiting
                    even if wait() does not  happened catch of exception will not give
                    any error
                     */
                    thread1.interrupt();
                }
            }
        });
        thread1.start();
        thread2.start();



    }
}
