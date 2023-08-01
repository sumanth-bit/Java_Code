package Exercises;
import java.util.*;

public class HashMapExerciseClass {

    public static void main(String args[]){

        //1. Write a Java program to associate the specified value with the specified key in a HashMap.
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
        hm.put(1,"Sumanth");
        hm.put(2,"Komali");
        hm.put(3,"Vani");
        hm.put(4,"Balaram");
        hm.put(5,"Anusha");
        System.out.println(hm);
        //2. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println(hm.size());

        //3. Write a Java program to copy all mappings from the specified map to another map.
        hm1.putAll(hm);
        System.out.println(hm1);

        //4. Write a Java program to remove all mappings from a map.
        hm1.clear();
        //5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        hm1.isEmpty();

        //6. Write a Java program to get a shallow copy of a HashMap instance.
        hm1 = (HashMap<Integer,String>)hm.clone();
        System.out.println(hm1);
        hm1.put(1, "Manisha");
        System.out.println(hm1);
        System.out.println(hm);

        //7. Write a Java program to test if a map contains a mapping for the specified key.
        System.out.println(hm.keySet().contains(1));
        System.out.println(hm.containsKey(1));

        //8. Write a Java program to test if a map contains a mapping for the specified value.
        System.out.println(hm.values().contains("Sumanth"));
        System.out.println(hm.containsValue("Sumanth"));

        //9.Write a Java program to create a set view of the mappings contained in a map.
        Set set = hm.entrySet();
        System.out.println(set);

        //10. Write a Java program to get the value of a specified key in a map.

        System.out.println(hm.get(1));

        //11. Write a Java program to get a set view of the keys contained in this map.
        //12. Write a Java program to get a collection view of the values contained in this map.
        System.out.println(hm.keySet()+", "+hm.values());




        //Map.Entry<Integer,String> mp =  hm.entrySet();











    }

}
