package Exercises;
import java.util.function.*;
import java.util.*;
/*
1.Lambda expressions are mainly used to create a shortcut for functional Interfaces i.e. a Single Function Interface
2. Instead of new Runnable(){.....} or new Comparator(){.....} we write ()->{....}
 */


// It is not possible for abstract class
interface Sum{
    public int sum(int x, int y);
}
interface EmptyorNot{
    public boolean emptyString(String s);

}

//1. We can use Generic class to interface as well
interface LowerCaseUpperCase <T>{
    public void convertCase(List<T> l1);
}


public class LambdaExpressionExercise {
    public static void main(String args[]) {
        int x = 7;
        int y = 8;
        // We should not give already defined variables in lambda Expression
        // Because It is an anonymous Inner class, So It has cpacity to use Outer class variables
        // Hence we shouldn't use outer class variables as it has scope till the method or class ends

        Sum s = (l, b) -> l + b;
        System.out.println(s.sum(x, y));
        EmptyorNot e = (str) -> str.isEmpty();
        System.out.println(e.emptyString(""));
        // Using Predicate

        Predicate<String> p = (str) -> str.isEmpty();
        System.out.println(p.test("Hello"));

        List<String> l1 = new LinkedList<>();
        l1.add("Sumanth");
        l1.add("Komali");
        l1.add("Vani");
        l1.add("Aman");

        LowerCaseUpperCase<String> word = (l) -> {
            for (String ele : l) {
                l.set(l.indexOf(ele), ele.toUpperCase());
            }

        };

        word.convertCase(l1);
        display(l1);

        /*
        1.Unary Operators are those which operates on a single operand
        2.Examples are ++,--,! these operands can work on only single Operand
        3.We have unary '-' like -1,-2 etc...

         *UnaryOperator Interface*

         1. This Interface has apply() method which apply a single operation on the parameter and
         2. Returns Same type

         */
        l1.replaceAll(str -> str.toUpperCase());
        display(l1);

        //or
        // If you want to do single operation for list of elements and that is unary,
        // Then try to use UnaryOperator.

        UnaryOperator<String> unary = (up) -> up.toLowerCase();
        for (String ele : l1) {
            l1.set(l1.indexOf(ele),unary.apply(ele));
        }
        display(l1);

        //4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
        //using predicate only conditional Operators returns true or false
        //Arithmatic operators returns integer Values
        //Arthimetic values are not considered as booleans in java

        Predicate<Integer> even_number = i-> {
            if(i.intValue()%2 == 0)
            {
                return true;
            }
            else{
                return false;
            }
        };

        //5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order

        //compareToIgnoreCase() is also a method
        Collections.sort(l1,(s1,s2)->s1.compareTo(s2));
        display(l1);



    }


    public static <T> void display(List<T> l) {
        for(T ele : l){
            System.out.print(ele+" ");
        }
        System.out.println("*************");

    }
}
