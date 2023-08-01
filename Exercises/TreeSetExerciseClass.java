package Exercises;
import java.util.*;

public class TreeSetExerciseClass {


    public static void main(String args[]){
        //1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
        Set<String> s = new TreeSet<>();

        s.add("Yellow");
        s.add("Black");
        s.add("Orange");
        s.add("Marron");
        s.add("yellow");
        //2. Write a Java program to iterate through all elements in a tree set.
        display(s);
        //3. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> s1 = new TreeSet<>();
        s1.addAll(s);
        display(s1);
        //4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        // We cannot use Collections.reverse() because it take only List

        Comparator<String> Comp = (String str1,String str2)->{
            if(str1.compareTo(str2) > 0) {
                return -1;
            }
            else if(str1.compareTo(str2) < 0){
                return 1;
            }
            else{
                return 0;
            }

        };
        Set<String> s2 = new TreeSet<>(Comp);
        s2.addAll(s);
        display(s2);


        //Method 2
        Iterator itr = s1.descendingIterator();
       // Iterator itr2 = s.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("***************");
        //5. Write a Java program to get the first and last elements in a tree set.

        // Try using HashSet,TreeSet  Directly so that we can get of methods
        System.out.println(s1.first());
        System.out.println(s1.last());

        System.out.println("***************");
        //6. Write a Java program to clone a tree set list to another tree set.
        // clone() method gives back a clonable Object So We need to type Cat
        // clone() method gives back a clonable Object So We need to type Cat
        TreeSet<String> s3 = (TreeSet<String>)s1.clone();

        //7. Write a Java program to get the number of elements in a tree set.

        System.out.println(s3.size());
        s3.add("White");

        //8. Write a Java program to compare two tree sets.

        for(String str : s3){
            if(! s1.contains(str)){
                System.out.println(str+" is not present in S1 set");
            }
        }
        //9. Write a Java program to find numbers less than 7 in a tree set.

        TreeSet<Integer> t = new TreeSet<Integer>();
        TreeSet<Integer> t1 = new TreeSet<Integer>();
        t.add(1);
        t.add(3);
        t.add(7);
        t.add(8);
        t.add(9);
        t.add(10);
        t.add(11);
        System.out.println("\n"+t+"\n"+"*********************");
        for(Integer i : t){
            if((int) i < 7){
                System.out.println(i);
            }
        }
        // Method -2
        //headSet() is also a method which Returns a view of the portion of this set whose elements are strictly less than toElement

        t1 = (TreeSet) t.headSet(7);
        System.out.println(t1);

        //10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        System.out.println(t.ceiling(6));
        System.out.println(t.ceiling(7));

        //11. Write a Java program to get the element in a tree set less than or equal to the given element.
        System.out.println(t.floor(2));

        //12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
        //Strictly specifies that "not equal".
        System.out.println(t.higher(6));
        //13. Write a Java program to get an element in a tree set that has a lower value than the given element.

        System.out.println(t.lower(7));

        //14. Write a Java program to retrieve and remove the first element of a tree set.

        System.out.println(t.pollFirst()+"\n*******************");
        display(t);

        //15. Write a Java program to retrieve and remove the last element of a tree set.

        System.out.println(t.pollLast()+"\n*******************");

        //16. Write a Java program to remove a given element from a tree set.

        t.remove(3);
        display(t);


    }

    public static void display(Set<? extends Object> s)
    {
        Iterator<? extends Object> itr = s.iterator();
        //ListIterator<? extends Object> itr = s.listIiterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("***************");


    }
}
