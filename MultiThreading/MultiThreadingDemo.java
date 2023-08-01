package MultiThreading;


class MyCounter extends Thread {
    private int threadNo;

    public MyCounter(int threadNo){
        this.threadNo = threadNo;
    }

    // Since it is extending the thread class
    //let us override run() method for making the thread to run
    // Since countMe is the functionality of the Script we will call
    //Same method in run method

    public void run(){
        countMe();
    }

    public void countMe(){
        for(int i = 1; i <= 9 ;  i++){
            try {
                sleep(100 );
            }
            catch(InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println("The Value of i is "+ i + " and the " +
                    "Thread no "+threadNo);
        }
    }
}

public class MultiThreadingDemo {

    public static void main(String args[])  throws InterruptedException{

        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);
        long startTime = System.currentTimeMillis();

        // Since you have overrided run method you should call
        //start() method since run method is automatically called by JVM
        counter1.start(); // we shouldn't call run() method directly because it doesn't make any difference

        System.out.println("*************");
        counter2.start();
        Thread.sleep(4600);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time required is "+ (endTime - startTime));
    }

}


