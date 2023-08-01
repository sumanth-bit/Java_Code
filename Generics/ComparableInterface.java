package Generics;
import java.util.*;
import java.lang.*;

/* Comparable interface is only used to sort custom-type object
i.e our own defined class and based on the attributes we have, we can define the soring mechanism
 */
class Comp implements Comparable <Comp>{
    private String s;

    public Comp(String s){
        this.s = s;
    }

    public String getS(){return s;}
    public int compareTo(Comp o){

        if(s.length() == o.s.length()){return 0;}
        else if (s.length() > o.s.length()) {return -1;}
        else {return 1;}

    }
    public String toString(){
        return s;
    }
//    public int compareTo(String o){
//
//        if(this.length() == o.length()){return 0;}
//        else if (s.length() > o.s.length()) {return -1;}
//        else {return 1;}
//
//    }

}



public class ComparableInterface {

    public static void main(String args[]){
        List<String> l1 = new LinkedList<>();
        l1.add("Sumanth");
        l1.add("Soring");
        l1.add("Strings");

        ComparableInterface c = new ComparableInterface();
        c.display(l1);
        Collections.sort(l1);
        c.display(l1);

        List<Comp> l2 = new LinkedList<>();
        l2.add(new Comp("Sumanth"));
        l2.add(new Comp("Soring"));
        l2.add(new Comp("Strings"));
        c.display(l2);
        Collections.sort(l2);
        c.display(l2);





    }

    public <T> void display(List<T> l){
        ListIterator<T> list = l.listIterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
        System.out.println("****************************");
    }

}
