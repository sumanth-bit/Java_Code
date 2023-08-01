package MultiThreading;

class Brackets{

    /* Only the below method is synchronized
    Remaining part of code might distrub the execution and
    will not give you proper results
     */
     public synchronized void generate(String s){
        for(int i = 0 ;i < 10; i++){
            if(i<5){
                System.out.print('[');
            }
            else{
                System.out.print(']');
            }
        }
        System.out.println();
    }


}

public class SynchronizedMethodClass {

    public static void main(String args[]){

        /* Usually synchronization helps to put a intrensic/Monitor lock on the object
        So if you have different object then Synchronized method may be effected

         */


        Brackets b1 = new Brackets();
        Brackets b2 = new Brackets();

       // b.generate();

        new Thread(new Runnable(){
            public void run(){
                //System.out.println("This is Thread 1 before");
                for(int i = 0; i <= 5; i++) {
                    b1.generate("Hello");
                }
                System.out.println("This is Thread 1 after");

            }

        }).start();

        new Thread(new Runnable(){
            public void run(){
                //System.out.println("This is Thread 2 before");
                for(int i = 0; i <= 5; i++) {
                    b1.generate("hello");
                }
                System.out.println("This is Thread 2 after");
            }

        }).start();
        //System.out.println("*********");

    }

}
