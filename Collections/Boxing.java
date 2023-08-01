package Collections;
import java.util.*;

public class Boxing {
    public static void main(String args[]){
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(11); // AutoBoxing
        l1.add(Integer.valueOf(1)); // This is what happens inside auto boxing


        l1.add(23);
        l1.add(Integer.valueOf(22));
        System.out.println(l1);

        System.out.println(l1.get(0)); // unboxing to primitive type
        System.out.println(l1.get(1).intValue()); // Inner operation of unboxing
        // float == Float.valueOf(122.3f)-->autoboxing
        // list.get(0).floatValue---->unboxing

        String s= "123";
        Integer i = Integer.valueOf(s);
        int k = i;
        System.out.println(i);
        System.out.println(k);

        //X.valueOf(int or float or string) converts into X type
        //Integer.intValue(x) gives the value in primitive Data type




    }
}
