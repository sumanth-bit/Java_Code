package Exercises;
import java.util.*;

class ComparatorClass implements Comparator<Integer>{
    public  int compare(Integer i,Integer j){
        if (i.compareTo(j) > 0) {
            return -1;
        }
        else if (i.compareTo(j) <0){
            return 1;

        }
        else{
            return 0;
        }

    }

}


public class TreeMapExerciseClass {

    public static void main(String args[]){

        //1. Write a Java program to associate the specified value with the specified key in a Tree Map.
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(0,"Blue");
        tm.put(1,"Green");
        tm.put(5,"Brown");
        tm.put(3,"Black");
        tm.put(4,"Orange");

        System.out.println(tm);

        TreeMap<Integer,String> tm1 = new TreeMap<>();
        //2. Write a Java program to copy Tree Map's content to another Tree Map.
        tm1.putAll(tm);
        System.out.println(tm1);

        //3. Write a Java program to search for a key in a Tree Map.

        if(tm1.containsKey(1)){
            System.out.println("Key 1 is present in TreeMap");
        }
        //4. Write a Java program to search for a value in a Tree Map.
        if(tm1.containsValue("Red")){
            System.out.println("Contains Red");
        }
        else{
            System.out.println("Does not contains Red");

        }
        //5. Write a Java program to get all keys from a Tree Map.
        System.out.println(tm1.keySet());
        System.out.println(tm1.values());

        //6. Write a Java program to delete all elements from a Tree Map.
        tm.clear();

        //7. Write a Java program to sort keys in a Tree Map by using a comparator.

        Comparator<Integer> comp = (Integer i,Integer j)-> {
            if (i.compareTo(j) > 0) {
                return -1;
            }
            else if (i.compareTo(j) <0){
                return 1;

            }
            else{
                return 0;
            }

        };
        TreeMap<Integer,String> tm2 = new TreeMap<>(new ComparatorClass());
        tm2.put(100,"Java");
        tm2.put(12,"Python");
        tm2.put(45,"C++");
        tm2.put(78,"C");
        System.out.println(tm2);
        //8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
        System.out.println(tm2.firstEntry());
        System.out.println(tm2.lastEntry());

        //9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
        System.out.println(tm2.firstKey());
        System.out.println(tm2.lastKey());

        //10. Write a Java program to get a reverse order view of the keys contained in a given map.

        for(Map.Entry<Integer,String> e : tm2.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println(tm2.entrySet());
        //10. Write a Java program to get a reverse order view of the keys contained in a given map.
        System.out.println(tm2.descendingKeySet());

        //11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.

        System.out.println(tm2.floorEntry(23));

        //12. Write a Java program to get the greatest key less than or equal to the given key
        System.out.println(tm2.floorKey(56));

        //13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.

        System.out.println(tm2.headMap(50));

        //14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.

        System.out.println(tm2.headMap(78,true));

        //15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
        System.out.println(tm2);

        System.out.println(tm2.higherEntry(78));
        //16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
        System.out.println(tm2.lowerEntry(45));

        //17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.

        System.out.println(tm2.lowerKey(100));

        //18. Write a Java program to get a NavigableSet view of keys in a map.

        System.out.println(tm2.navigableKeySet());

        //19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.

        System.out.println(tm2.lastEntry());
        System.out.println("tm1 "+tm1);
        System.out.println(tm1.remove(tm2.lastEntry().getKey()));



        //20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.

        System.out.println(tm2.firstEntry());
        System.out.println(tm1.remove(tm2.firstEntry().getKey()));
        System.out.println("tm1 After removal "+tm1);


        //21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).

        System.out.println(tm.subMap(0,true,4,false));

        //22. Write a Java program to get the portion of a map whose keys range from a given key to another key
        System.out.println(tm.subMap(0,true,4,true));

        //23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.

        System.out.println(tm.tailMap(3,true));

        //24. Write a Java program to get a portion of a map whose keys are greater than a given key.

        System.out.println(tm.tailMap(3,false));

        //25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.

        System.out.println(tm.ceilingEntry(2));

        //26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
        System.out.println(tm.ceilingKey(2));







    }
}
