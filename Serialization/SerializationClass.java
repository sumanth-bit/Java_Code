package Serialization;

import java.io.*;
import java.io.IOException;

public class SerializationClass {
    public static void main(String args[]){
        Employee emp1 = new Employee("Sumanth",950265159 );
        Employee emp2 = new Employee("Komali",965271109);


        /*
        1. We will serialize it "emp"
        2. Serialize is to convert the obj into byte stream and Store it ina file
        3. So that we deserialize it and take it back whenever it is required
         */

        try{
            FileOutputStream fw = new FileOutputStream("Serialization\\Char.txt");
            ObjectOutputStream os = new ObjectOutputStream(fw);
            os.writeObject(emp1);
            os.writeObject(emp2);
            fw.close();
            os.close();
            System.out.println("Created File and copied Objects");

        }
        catch(IOException e){

            System.out.println("Cannot write into File IO exception occured");

        }

    }
}
