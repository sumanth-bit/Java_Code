package MultiThreading;

public class WaitNotifyClass {

      static int balance = 500;
    public  void withdraw(int amount) throws InterruptedException{
        synchronized (this) {
            if (balance <= 0 || balance < amount) {
                System.out.println("Wait till the amount is deposited");
                wait();
            }
        }
        balance = balance - amount;
        System.out.println("Amount has been withdrawn successfully Current Balance "+balance);
    }

    public void deposit(int amount){
        System.out.println("adding  amount is "+ amount);
        balance = balance + amount;
        synchronized (this){

            notify();

        }
        System.out.println("Amount has been added current balance is "+balance);


    }

    public static void main(String args[]) {
        WaitNotifyClass obj = new WaitNotifyClass();

        Thread t1 = new Thread(new Runnable(){
            public void run(){
                try {
                    Thread.sleep(3000);
                    obj.withdraw(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                obj.deposit(3000);
            }
        });

        t2.start();
    }
}
