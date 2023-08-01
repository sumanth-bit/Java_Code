package Exercises;

import java.util.concurrent.locks.ReentrantLock;

class BankAccount{
    public int amount;
    ReentrantLock lock = new ReentrantLock();

    public BankAccount(int a){
        this.amount = a;
    }
//
//    public void deposit(int amount){
//        lock.lock();
//        try{
//            this.amount = this.amount + amount;
//            System.out.println("Amount has been deposited Balance is :" + this.amount);
//        }
//        finally{
//            lock.unlock();
//        }
//    }
//    public void withdraw(int amount){
//        lock.lock();
//        try{
//            if (this.amount >= amount) {
//                this.amount = this.amount - amount;
//            }
//            else{
//                System.out.println("Less Money");
//            }
//        }
//        finally{
//            lock.unlock();
//        }
//    }


    public void deposit(int amt){

        synchronized (this) {
            System.out.println(Thread.currentThread().getName()+ "started");
            this.amount = this.amount + amt;
            System.out.println("Amount has been deposited Balance is :" + this.amount);
            this.notify();
            System.out.println(Thread.currentThread().getName()+ "Notified");
        }
    }

    public void withdraw(int amt){

        synchronized (this) {
           System.out.println(Thread.currentThread().getName());
            // We need to use while Loop because after waiting we need to check again if requirement is
            // met or not, if met and while become false you need not to execute wait()
            // So we need while() loop Mostly
            while(this.amount < amt) {
                try {
                    System.out.println(Thread.currentThread().getName()+ " Should wait");
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName()+ "Started");

                this.amount = this.amount - amt;
                System.out.println("Amount has been Withdrawn " + amt + " Balance is : " + this.amount);

            }
        }

    }




public class BankExerciseJava {
    public static void main(String args[]){
        BankAccount bk = new BankAccount(0);
//        bk.deposit(1000);
//        bk.withdraw(3000);
        Thread t1 = new Thread(()->{
            Thread.currentThread().setName("Thread1");

            bk.withdraw(5000);

        } );
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                Thread.currentThread().setName("Thread2");

                bk.deposit(10);
            }

        });
        Thread t3 = new Thread(()->{
            Thread.currentThread().setName("Thread3");

            bk.withdraw(50000);

        } );
        Thread t4 = new Thread(new Runnable(){
            public void run(){
                Thread.currentThread().setName("Thread4");

                bk.deposit(10);
            }

        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
