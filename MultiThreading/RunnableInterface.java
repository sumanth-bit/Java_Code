package MultiThreading;


class Counter implements Runnable{
    private int threadNo;

    public Counter(int threadNo){
        this.threadNo = threadNo;
    }

    // Since it is extending the thread class
    //let us override run() method for making the thread to run
    // Since countMe is the functionality of the Script we will call
    //Same method in run method

    public void run(){
        countMe();
    }
    public void start(){
        run();
    }

    public void countMe(){
        for(int i = 1; i <= 9 ;  i++){

            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println("The Value of i is "+ i + " and the " +
                    "Thread no "+threadNo);
        }
    }
}

public class RunnableInterface {

    public static void main(String args[])  throws InterruptedException{

        Thread thread1 = new Thread(new Counter(1));
        Thread thread2 = new Thread(new Counter(2));

        thread1.start();
        thread2.start();


        /* creating an anonymous object for thread
        Using Runnable interface we can create an anonymous object and
         */


        new Thread(new Runnable() {
            @Override
            public void run() {
                new Counter(1);
                new Counter(2);
            }
        }).start();


    }

}


