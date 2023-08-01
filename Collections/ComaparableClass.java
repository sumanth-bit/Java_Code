package Collections;
import java.util.*;

class Students<I extends Comparable<? super I> ,S extends Comparable<? super S>> implements Comparable<Students<I,S>>{
    private I age;
    private S name;
    public Students(I a, S n){
        age = a;
        name = n;
    }
    public int compareTo(Students<I,S> s){
        return name.compareTo(s.name);
    }
    public I getAge(){return age;}
    public S getName(){return name;}
    public String toString(){
        return " "+name;
    }
}

public class ComaparableClass {
    public static void main(String args[]) {
        Integer a = 1;
        Integer b = 12;
        System.out.print(a.compareTo(b));

        List<Students<Integer,String>> l1 = new LinkedList<>();
        l1.add(new Students<Integer,String>(23, "Sumanth"));
        l1.add(new Students<Integer,String>(50, "komali"));
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        Integer i = Integer.valueOf(23);
        System.out.println(i);
        Integer k = new Integer(1);
        System.out.println(i>k);



    }

}
