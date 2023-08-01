package Exercises;
import javax.print.attribute.standard.PresentationDirection;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class LambdaExpressionExercise2 {
    public static void main(String args[]){
        //6. Write a Java program to implement a lambda expression to find the average of a list of doubles.
        List<Double> s = new ArrayList<>();
        s.add(12.23d);
        s.add(33.45d);
        s.add(23.33d);
        s.add(44.45d);
        s.add(198.23d);
        s.add(46.45d);
        s.stream().forEach(System.out::println);
        /*
        1. For finding average we have to use the following functions
        2. since you need value in primitive type convert it using map() function
        3. call average() method to get average value orElse(double value)

         */

        double avg = s.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("*********************");
        System.out.println(avg);


        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(23);
        l1.add(67);
        l1.add(12);
        l1.add(14);
        l1.add(12);
        //7. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
        HashSet<Integer> h = new HashSet<>();
        h.addAll(l1);
        l1.stream().forEach((i)->System.out.print(i+" "));
        List<Integer> unique = new ArrayList<>();

        l1.stream().distinct().forEach(unique::add);
        System.out.println(l1);

        //8. Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.

        //Here you can use UnaryOperator class to take single object or value and perform operation and return the result
        //We have only have single method inside it applyAsLong(), So it a funtional Interface which returns a long value


        LongUnaryOperator factorial = (n)->{
            long fact = 1;
            for(int i = 1; i<= n; i ++){

                fact = fact * i;
                //System.out.println(fact);
            }
            return fact;

        };

         long n = factorial.applyAsLong(20);
        System.out.println(n);

        int fact = factorial(4);
        System.out.println(fact);

        Float a =  Float.valueOf(12); // for better time and space complexity
        Integer b = Integer.valueOf(13);
        float c = 12.3f;
        System.out.println(c+b);

        Predicate<Integer> p = (i)->{
            for(int j = 2; j<= i/2; j++){
                if(i%j == 0){
                    return false;
                }
            }

            return true;
        };

        boolean isPrime = p.test(23);
        System.out.println(isPrime);

        //10. Write a Java program to implement a lambda expression to concatenate two strings.

        BiFunction<String,String,String> concat = (str1,str2)-> str1 + str2;

        String s1 = "Hello";
        String s2 = "Morning";
        String k = concat.apply(s1,s2);
        System.out.println(k);

        //11. Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.

        Integer min = l1.stream().min((i1,i2)->i1.compareTo(i2)).get();
        Integer max = l1.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("min value is "+min+"max value is "+max);

        Stream<Integer> stream =l1.stream();

        //12. Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.

        int sum = stream.mapToInt(Integer::intValue).sum();
        long multi = l1.stream().reduce((x,y)->x*y).get();
        System.out.println(sum+" "+multi);

        //13. Write a Java program to implement a lambda expression to count words in a sentence.

        String s3 = "Hi How are you doing guys";
        Arrays.asList(s3.split("\\s"));
        System.out.println(Arrays.asList(s3.split("\\s").length));


















    }

    public static int factorial(int n ){

        if( n == 0){
            return 1;
        }
        else if (n == 1){
            return 1;
        }
        else{
            return  n * factorial( n - 1);
        }
    }


}