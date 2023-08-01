package Collections;
import java.util.*;

public class SetsClass {
    // In Set Null keys are not allowed

    public static void main(String args[]){
        // we are using HashSet which doesn't maintain order
        // it is faster for add,delete,search
        // it allows only 1 null key
        Set<String> s = new HashSet<>();
        s.add("Sumanth"); // to add we use .add method
        s.add("Komali");
        s.add("Vani");
        s.add("komali");
        System.out.println(s);
        System.out.println(s);
        System.out.println(s.contains(1));

        //LinkedHashSet maintains it's order
        //it is second to hashSet
        //Allow a single null key

        Set<Double> s1 = new LinkedHashSet<>();
        s1.add(23.4555d);
        s1.add(56.5111d);
        s1.add(1.2d);
        System.out.println(s1);

        //TreeSet shows the data in Sorting order
        //It is little slower since it need to sort
        //Does not allow a null

        Set<Integer> s2 = new TreeSet<>();
        s2.add(122);
        s2.add(234);
        s2.add(122);
        s2.add(89);
        System.out.println(s2);




    }


}
