package MultiThreading;

class Bracket{
    private int sum = 0;


    public void generate(int k) {


        try{Thread.sleep(1000);}
        catch (InterruptedException e){
            System.out.println("Exception Occured but can be handled and remaining code executes");
        }
        System.out.println("Outside Synchronize Block "+ k);
       synchronized(this){
            System.out.println("Inside Synchronize Block "+k);
            for(int i = 0 ;i < 10; i++){
                if(i<5){
                    sum = sum + 1;
                    System.out.print(" Sum is "+sum);
                }
                else{
                    System.out.print(']');
                }
            }
        }
        try{Thread.sleep(1);}
        catch (InterruptedException e){
            System.out.println("Exception Occured but can be handled and remaining code executes");
        }

        System.out.println("Hello Thread No " + k);
    }


}

public class SynchronizedBlockClass {

    public static void main(String args[]) throws InterruptedException{

        Bracket b = new Bracket();

        // b.generate();

        new Thread(new Runnable(){
            public void run()  {
                //System.out.println("This is Thread 1");
                for(int i = 0; i < 5; i++) {

                    b.generate(1);


                }
                System.out.println("End of Thread 1");

            }

        }).start();

        new Thread(new Runnable(){
            public void run(){

                for(int i = 0; i < 5; i++) {

                    b.generate(2);

                }
                System.out.println("End of Thread 2");
            }

        }).start();
        //System.out.println("*********");

    }

}



