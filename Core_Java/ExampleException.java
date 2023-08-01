package Core_Java;

import java.io.FileNotFoundException;

/*
1. For all checked Exceptions either "suitable" try/ catch block is enough or throws keyword along with suitable try/catch will not give runtime Error and Compile time error and
will be executed properly
2. If you throw or create a Checked Exception Scenario without throws it gives "Compile time Error"
3. If you throw or create a Checked Exception Scenario with throws, it covers compiler time error but gives run time error
4. Both above statements are for without try/catch statements
5. throws is not required for unchecked exception (which extends RuntimeException)
6. If you have not suitable try/catch block with throws keyword still it gives Run time Exception
 */
public class ExampleException {

    public static void main(String args[]) throws Exception{

        int x = 0;

        try{
            throw new FileNotFoundException();
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zERO eXCEPTION");

        }
        System.out.println("After exception is being raised");



    }
}
