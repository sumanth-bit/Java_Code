package Core_Java;

public class ExceptionsClass {

    public static void main(String args[]){
        int x = 21;
        int y = 0;

        try {
            System.out.println(x / y);
            System.out.println("Inside try after exception leading statement");

        }

        catch(Exception e){
            System.out.println("It is Divide by zero exception");
        }


        try{
            MethodException();

        }
        /* When we have multiple catch blocks the order need to be specific
        i.e. most specific to most general otherwise the code becomes unreachable
         */
        catch(ArithmeticException a){
            System.out.println("Arithmetic Exception");
        }
        catch(Exception e){
            System.out.println("Again!!");
        }
        finally{

         System.out.println("Finally block is executed irrespective of exception caught or not" +
                 "but need to have try catch block preceding");
        }
        System.out.println("After all try and catches");


    }

    public static void MethodException(){
        System.out.println(11/0);
    }
}
