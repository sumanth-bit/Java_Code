package Exercises;
import java.util.*;

public class HashSetExerciseClass {

    public static void main(String args[]){
        HashSet<Integer> s = new HashSet<>();

        s.add(1);
        s.add(2);
        //1. Write a Java program to append the specified element to the end of a hash set.
        s.add(3);
        //2. Write a Java program to iterate through all elements in a hash list.
        display(s);
        System.out.println(s.size());
        //4. Write a Java program to empty an hash set.
        s.clear();

        //5. Write a Java program to test if a hash set is empty or not.
        System.out.println(s.isEmpty());

        //5. Write a Java program to test if a hash set is empty or not.

        s.add(1);
        s.add(2);
        Integer[] arr = new Integer[s.size()];
        s.toArray(arr);
        s.toArray();

        System.out.println(s.getClass());
        System.out.println("**************");

        //8. Write a Java program to convert a hash set to a tree set.
        Set<Integer> treeSet = new TreeSet<>(s);

        treeSet.add(0);

        display(treeSet);
        //9. Write a Java program to find numbers less than 7 in a tree set.
        for (Integer i : treeSet){
            if(i<7){
                System.out.println(i);
            }
        }
        System.out.println("**************");
        //10 and 11 . Write a Java program to compare two hash set.

        Set<Integer> s1 = new HashSet<>();

        s1.add(4);
        s1.add(5);
        s1.add(2);
        s1.add(1);
        display(s);
        display(s1);

        for(Integer i : s){
            if(! s.contains(i)){
                s1.remove(i);
            }
        }
        display(s1);

        s1.retainAll(s);
        display(s1);







    }
    public static void display(Set<? extends Object> l){
        for(Object o:l){
            System.out.println(o);
        }
        System.out.println("**************");
    }
}
