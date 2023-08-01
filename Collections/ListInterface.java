package Collections;
import java.util.*;

public class ListInterface {
    public static void main(String args[]){

        List<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        System.out.println(l);
        List<String> l1 = new ArrayList<>();
        l1.add("Sumanth");
        l1.add("Komali");
        System.out.println(l1);
        printlist(l1);

        //For sorting we have .sort() methoD availible in List Interface
        l1.sort(null);
        printlist(l1);
        Collections.reverse(l);
        printlist(l);

    }
    static <T> void printlist(List<T> l){
       ListIterator<T> i = l.listIterator();
       while(i.hasNext())
       {
           System.out.println(i.next());
       }


    }
}
