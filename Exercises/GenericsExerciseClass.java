package Exercises;
import java.util.*;



public class GenericsExerciseClass {

    public static void main(String args[]) {
        GenericsExerciseClass e = new GenericsExerciseClass();


        List<Integer> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        ArrayList<String> l3 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(3);
        l2.add("Sumanth");
        l2.add("Komali");
        l2.add("Anusha");
        e.display(l1);
        e.display(l2);

        // Primitive data types are not applicable for Generic Methods
        // Only Objects are allowed so Integer objects are been sent

        //1. Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.
        Integer[] a = {23, 45, 67, 89, 10, 12};
        Integer[] b = {23, 45, 67, 89, 56, 78};
        e.display(a, b);

        String[] str1 = {"Hello", "I", "am", "Same"};
        String[] str2 = {"hello", "i", "am", "same"};

        e.display(str1, str2);
        System.out.println(a[1] + a[2]);

        //2. Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.

        double[] sum = e.evenOddSum(a);

        /*
        Type casting
        1. Widening or Implicit Type casting
         smaller_type b
         larger_type a = b

        2. Narrowing or Explicit Type Casting
        larger_type w
        samller_type v = (smaller_type) w

        we need explicit (int),(float) for narrowing to reduce i.e from large small
        we don't neeed them for Implicit i.e Widening i.e. changing to big variable
         */
        System.out.println((int)sum[0]+","+(int)sum[1]);

        System.out.println(e.display1(l1,3));



    }

    public <T> void display(List<T> l) {
        for (T ele : l) {
            System.out.println(ele);

        }

    }
   /*
    1. While calling a method with Generic type i.e. is <> are present
    2. We should exactly match the type otherwise we will see error
    3. Whereas if you do not use any Generic declarations  we can send any Parent class
    4. like Base b = new Derived() but only base class overriden methods can be called inside
    */

    public <T> int display1(List<T> l, T ele) {
        if(l.contains(ele)){
            return l.indexOf(ele);
        }
        else{
            return -1;
        }

    }

    public <T> void display(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("arrays are not same");
            return;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("arrays are not same");
                    return;
                }
            }
        }
        System.out.println("Both arrays are same");
    }

    public <T extends Number> double[] evenOddSum(T[] arr1) {
        // when you are declaring a variable with T type you can assign only "null" other values are not possible
        // as it is unknown

        // Declaring it as double making which ever value comes that can be adjusted i.e short,long,
        // integer,float, Double.
        double evenSum = 0;
        double oddSum = 0;
        for (T i : arr1) {
            if (i.doubleValue() % 2 == 0) {
                evenSum = evenSum +  i.doubleValue();
            } else {
                oddSum = oddSum + i.doubleValue();
            }

        }
        double[] a = {evenSum,oddSum};

        return a;

    }





}
