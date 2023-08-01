package Core_Java;

import java.util.*;

import java.io.*;
public class ThrowInMethodClass {
    public static void main(String args[]) throws Exception {
        ThrowInMethodClass c = new ThrowInMethodClass();
        try{
            someMethod();
            System.out.println("Hello");
        }
        catch(Exception e){
            System.out.println("Without Throws in Method");
        }
        someMethod();


    }
    public static void someMethod() throws Exception  {
        try {
            throw new IOException();
        }
        catch(Throwable t){
            System.out.println("Inside Method");
        }

        throw new InterruptedException();
    }
}
