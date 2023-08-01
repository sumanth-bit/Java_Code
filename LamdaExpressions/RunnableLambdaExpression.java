package LamdaExpressions;

interface Hello{
    public void greet();
}

public class RunnableLambdaExpression {
    public static void main(String args[]){

        /* Only functional interface can implement Lambda expression and
        Interface which are considered Functional Interface in Documentation
        ()-> is the syntax for the target Class
        we need to mention the only implementation part of the abstract method

        Given down are examples
         */

        Hello h = new Hello(){
            public void greet(){
                System.out.println("Hi how are you Anonymous Class");
            }
        };
        h.greet();

        Hello h1 = ()->System.out.println("Hi this is Lambda Expression");

        h1.greet();



        new Thread(new Runnable(){
            public void run(){
                System.out.println("Hello this is  Normal thread 1");
            }


        }).start();

        new Thread(()->System.out.println("Hello this is Lambda Expression thread 1")).start();
        new Thread(()->{
            System.out.println("Hello this is Lambda Expression thread 2 line 1");
            System.out.println("Hello this is Lambda Expression thread 2 line 2");

        }).start();

    }

}
