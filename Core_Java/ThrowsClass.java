package Core_Java;
import java.io.*;

public class ThrowsClass {


    public static void main(String args[])  {
        /* First Try is to demonstrate the Throw key word
        Which have potential to throw an exception at run time
        which can be handled by  catch block defined.
         */

        try {
            FileReader f = new FileReader("file.txt");

            BufferedReader b = new BufferedReader(f);
            b.close();
        } catch (FileNotFoundException f) {
            System.out.println("Hello We can Execute program after Throws " );
        }
        catch (IOException e){
            System.out.println("Since we are closing the File IO exception need to be implemented");
        }
        /* This Try Block is used to demonstarte Throw Key word
        which is can deliberately throw an exception.
         */
        try{
            System.out.println("Here  we throw Exception Deliberately");
            throw new FileNotFoundException();
        }
        catch(Exception e){
            System.out.println("Catch block for throw exception");
        }
    }
}
