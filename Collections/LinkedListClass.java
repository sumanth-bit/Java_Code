package Collections;
import java.util.*;

public class LinkedListClass {

    public static void main(String args[]){
        LinkedList l = new LinkedList();
        l.add("l");
        l.add(1);
        l.add(3.4f);
        l.add(4.555d);
        System.out.println(l);
        l.add(0,"Suamnth");
        System.out.println(l);
        l.remove(4);
        System.out.println(l);
        l.remove();
        System.out.println(l);// Linked list removes at the Head position and \
        // Adds at the tail position
        l.set(2,"Komali"); // if that index doesn't exist setting is not possible
        System.out.println(l);



    }
}
