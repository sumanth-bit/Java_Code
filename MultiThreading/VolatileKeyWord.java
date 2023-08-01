package MultiThreading;

class Demo{
    volatile public static int flag = 0;
}

public class VolatileKeyWord {

    public static void main(String args[]){

        new Thread(new Runnable(){
            public void run(){
                while(true){
                        if(Demo.flag == 0){
                    System.out.println("Thread1 is running");
                }
                else{
                    break;}
                }
            }
        }).start();

        new Thread(new Runnable(){
            public void run(){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Demo.flag = 1;
                System.out.println("Thread 2 flag has changed");
            }


        }).start();
    }

}
