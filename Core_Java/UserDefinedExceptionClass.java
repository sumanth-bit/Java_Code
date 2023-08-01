package Core_java;
import java.io.*;


class UserDefinedException extends Exception{
    public void Method(){
        System.out.println("This is User Defined Exception");
    }
}

public class UserDefinedExceptionClass
{
    public static void main(String args[]) throws IOException{
        try{
            throw new UserDefinedException();
        }
        catch(UserDefinedException e){
            e.Method();
        }
        try{
            throw new NullPointerException();
        }
        catch(ArithmeticException a){
            System.out.println("This is for Arithmetic Exception");
        }
        catch(NullPointerException e){
            System.out.println("This is for Null Pointer Exception");
        }
        throw new FileNotFoundException();
    }

}
