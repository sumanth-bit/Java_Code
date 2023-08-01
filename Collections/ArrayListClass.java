package Collections;
import java.util.*;

public class ArrayListClass {

    public static void main(String args[]) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Sumanth");
        l.add("Komali");
        l.add("Vani");
        l.add("Anusha");
        System.out.println(l);
        //Here it removes the element by Index i.e 0th index will be removed.
        l.remove(0);
        //It adjusts the positions of the elements and moves second one to first
        System.out.println(l.get(0));
        //we can also remove elements by string i.e Objects
        l.remove("Komali");
        System.out.println(l);
        //Searching an Element in the arraylist  we use indexOf() method
        int pos = l.indexOf("Vani");
        if(pos != -1){
            //To update we use set Method
            l.set(pos," Vaani");

        }
        l.add(1,"Sumanth");
        System.out.println(l);

    }
}
