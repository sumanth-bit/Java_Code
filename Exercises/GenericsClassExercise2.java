package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.function.Predicate;



public class GenericsClassExercise2 {

    public static void main(String args[]){
        List<Integer> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(3);
        l2.add("Sumanth");
        l2.add("Komali");
        l2.add("Anusha");
        System.out.println(reverseOrder(l1));
        System.out.println(reverseOrder(l2));
        List<Integer> l3 = new ArrayList<>();
        l3.add(100);
        l3.add(100);
        l3.add(100);
        System.out.println(Merge(l1,l3));
        /*
        Doubt--Why just only i-> i > 2 for predicates not other lambda expressions?
        Answer--> It is same for lambda expressions as well cuz it is functional Interface
          which has only one method so, number of arguments must be same

         */
        System.out.println(Predict(l1,i->i>2));
        System.out.println(Predict(l2,name->name.startsWith("S")));

        // This is how a Predicate will be implemented
        // It is a Generic method which take type argument
        // So This is anonymous Class you are creating an object to the Interface
        // By Implementing it's abstract method there, So it is anonymous. and Anonymous Inner Class as well
        Predicate<String> b = new Predicate<String>( ){
            public boolean test(String s) {
                if (s.startsWith("l")) {
                    return true;
                }
                return false;

            }
        };

        b.test("Hello");

    }

    public static <T> List<T> reverseOrder(List<T> a){
        Collections.reverse(a);
        return a;
    }

    public static <T> List<T> Merge(List<T> l1,List<T> l2){
        l1.addAll(l2);
        return l1;
    }

    public static <T> List<T> Predict(List<T> l1, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T ele : l1){
            if(p.test(ele))
                result.add(ele);
        }

        return result;

    }

}
