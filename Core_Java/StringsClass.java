package Core_Java;
import java.util.*;

public class StringsClass {
    public static void main(String args[]) {
        // This is called String Object for which we need to use equals
        // Equals method to compare 2 Strings
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        // These are called String literals which can be
        // compared using == , concated +
        String name = "Sumanth";
        String last = "Paramkusam";

        System.out.println(name + last);
    if(s1.equals(s2)){
        System.out.println("True");
    }
    }

}
