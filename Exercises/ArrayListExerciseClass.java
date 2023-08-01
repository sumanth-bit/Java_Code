import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class ArrayListExerciseClass {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println(colors);
        display(colors);

        //To add at any position we can use add(index,value) version
        colors.add(0,"White");
        display(colors);

        System.out.println( colors.get(3));
        //Update at a position in Java
        colors.set(2,"Voilet");
        display(colors);

        // Remove third Element from the list

        colors.remove(2);
        display(colors);

        // Search for an  Element in the List

        System.out.println(colors.contains("Yellow"));

        if(colors.contains("Yellow")){
            System.out.println(colors.indexOf("Yellow"));

        }

        // sort
        Collections.sort(colors);
        display(colors);


        List<Object> k = new ArrayList<>();
        k.add(1);
        k.add(1);
        k.add(1);
        //Collections.copy should need destination should be atleast of length of source or more than that
        Collections.copy(k,colors);

        display(k);
        //Shuffle the list of elements
        Collections.shuffle(k);
        display(k);
        // Reverse a List
        Collections.reverse(k);
        display(k);

        //Extract a portion of list i.e sublist
        k.add("Maroon");
        k.add("Black");
        System.out.println(k.subList(1,3));

        //Compare 2 ArrayLists

        // k should have all the elements in the colors

        System.out.println(k.containsAll(colors));
        System.out.println("***********************");

        display(k);
        String value1 = "Yellow";
        String value2 = "Red";
        System.out.println(k.indexOf(value1));
        System.out.println(k.indexOf(value2));
        k.set(k.indexOf(value1),value2);
        k.set(k.indexOf(value2),value1);

        display(k);

        // Swapping -2

        Collections.swap(k,3,4);
        display(k);

        // Joining 2 lists
        List<Object> all = new ArrayList<>();
        all.addAll(colors);
        all.addAll(k);

        display(all);
        Predicate<String> greaterthan4 = x->x.length()>4;

        //Clone an arrayList to another ArrayList
        //List<String> newlist =(ArrayList<String>)colors.clone();

        //Empty a List using removeAll() method
        all.removeAll(all);
        display(all);

        System.out.println(all.isEmpty());

        // Check fixed size for a ArrayList

        List<Integer> l = new ArrayList<>(2);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(3);
        display(l);

        System.out.println(l.size());

        l.remove((Integer)1);display(l);


    }
    public static void display(List<? extends Object> colors){
        for(Object i : colors){
            System.out.println(i);
        }
        System.out.println("***************");

    }

}