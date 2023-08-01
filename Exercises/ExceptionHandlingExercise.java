package Exercises;
import java.io.*;
import java.nio.Buffer;

public class ExceptionHandlingExercise  {

    public static void main(String args[]){
        int x = 10,y;
        //1. Write a Java program that throws an exception and catch it using a try-catch block.
        try{
            y = x/0;

        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occured");
        }

        for(int i= 0; i<10; i++) {

            try {
                evenMethod(i);
//                if(i % 2 != 0){
//                    throw new Exception();
//                }

            } catch (Exception e) {
                System.out.println("Odd number");
            }
        }
        //3. Write a Java program to create a method that reads a file and throws an exception if the file is not found.


            try{
                File f = new File("C:\\Users\\suman\\OneDrive\\Desktop\\Java\\practice3.txt");
                BufferedReader br = new BufferedReader(new FileReader(f));
                int k = 1;
                try{
                /*
                1. read() method reads character by character as a unicode so declare iterator as int
                and type cast it will printing  and end of file is -1.
                 2. readLine() method reads as String so declare as iterator as String and end of file ois null

                 */
                while((k = br.read()) != -1){
                    System.out.print((char)k);

                }}
                catch(IOException e){
                    System.out.println("IO exception while reading");

                }

            }
            catch(FileNotFoundException e){
               // e.printStackTrace();
                System.out.println("No Such File");
            }

       //5. Write a Java program that reads a file and throws an exception if the file is empty.
        try{
            File f = new File("C:\\Users\\suman\\OneDrive\\Desktop\\Java\\practice1.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String k;
            try {
                if((k = br.readLine()) == null){
                    throw new Exception();

                }

            }
            catch(IOException e){
                System.out.println("IO exception while reading");

            }
            catch(Exception e){
                System.out.println("Empty File");
            }

        }
        catch(FileNotFoundException e){
            // e.printStackTrace();
            System.out.println("No Such File");
        }


        try{

           NegativeNumber();
        }
        catch(NegativeNumberException e){
            System.out.println("User defined Exception");
        }

    }



    // For unchecked Exception throw requires throws keyword for the method signature
    public static void evenMethod(int i){
        if(i % 2 != 0){
            throw new IllegalArgumentException();

        }
    }

    public static void NegativeNumber(){
        File f = new File("C:\\Users\\suman\\OneDrive\\Desktop\\Java\\practice1.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            for (int i = 0; i <= 10; i++) {
                if (i != 5) {
                    bw.write(i + ",");
                } else {
                    bw.write((-i) + ",");
                }

            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found ");


        }
        catch(Exception e){
            System.out.println("Exception Occured");
        }

        try{
            System.out.println("Reading the file");
            BufferedReader br = new BufferedReader(new FileReader(f));
            int k = 0;
            String s = "";
            while((k = br.read()) != -1){
                s = "";
                while((char)k != ',') {
                    s = s + (char)k;
                    k = br.read();
                }
                System.out.println(s+" ");
                if(Integer.parseInt(s) < 0){
                    throw new NegativeNumberException("We Found a Negative number");

                }

            }
        }
        catch(FileNotFoundException e){
            System.out.println("This is file not Found Exception");

        }
        catch(IOException e){
            System.out.println("This is For IOException i.e for read");
        }


    }


}


/*
1. User defined Exceptions can be checked or unchecked depends on the class you extend
2. If we extend all the classes above the RuntimeException it is considered as checked Exception and needs
   either a throw declaration or Try catch

3. If it extends below or equal to RuntimeException  then it is unchecked Exception do not need throw keyword.

4.Always remember while using Files you need to Throw IOException for main method for read and write operations

5. FileNotFoundException,ClassNotFoundException can be catched.
 */

class NegativeNumberException extends RuntimeException{

    NegativeNumberException(String s){
        System.out.println("We Got negative number");
    }

}
