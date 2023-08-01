package Collections;
import java.util.*;

public class MapsClass {

    public static void main(String args[]){

        Map<Integer,String> m = new HashMap<>();
        m.put(1,"Rahul");
        m.put(2,"Sumanth");
        m.put(3,"Virinchi");

        System.out.println(m);

        for( Map.Entry<Integer,String> entry : m.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        m.put(100, "Dhanush");
        System.out.println(m.get(100));

        Iterator<Map.Entry<Integer,String>> entry = m.entrySet().iterator();
        while(entry.hasNext()){
            Map.Entry<Integer,String> e = entry.next();
            System.out.println(e.getKey()+ "  "+e.getValue());
        }
        m.remove(200);
        System.out.println(m);

    }



}
