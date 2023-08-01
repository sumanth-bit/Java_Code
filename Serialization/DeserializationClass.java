package Serialization;
import java.io.*;

/*
 1. FileOutputStream
 2. ObjectOutputStream(new FileOutputStream)
 3. FileInputStream
 4. ObjectInputStream(new FileInputStream)

 */

public class DeserializationClass {



    public static void main(String args[]) {
        Employee emp = null;
        Employee emp1 = null;
        Employee emp2 = null;
        try {
            FileInputStream fw = new FileInputStream("Serialization\\Char.txt");
            ObjectInputStream is = new ObjectInputStream(fw);
            try {
                while ((emp = (Employee) is.readObject()) != null) {
                    System.out.println(emp);
                    emp = null;
                }


                is.close();
                fw.close();
            }
            catch (ClassNotFoundException e) {
                System.out.println("Couldn't find the mentioned Class");
            }
            //System.out.println(emp1 + " "+ emp2);
           //
        } catch (IOException es) {
            System.out.println("Couldn't find the mentioned file");
        }
    }
}
