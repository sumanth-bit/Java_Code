package LamdaExpressions;

import java.util.function.IntPredicate;

public class PredicateClass {

    public static void main(String args[]){
        IntPredicate l1 = x -> x<18;
        IntPredicate l2 = x -> x<10;

        /* This interface object creation that is creating an anonymous inner class

        Will created as above using the lambda expression

        This is specifically for Predicates as it returns the boolean Value
         */
        System.out.println(l1.test(15));
        System.out.println(l2.test(18));


        IntPredicate lowerthan18 = new IntPredicate(){
            public boolean test(int x){
                if(x < 18){
                    return true;
                }
                else {
                    return false;
                }
            }
        };
        System.out.println(lowerthan18.test(18));

        // these predicates can be combined as following
        System.out.println(l1.and(l2).test(17));

        // we can pass them to method as well as just like any variable

        /* Remember
        1. ()->...... is actual lambda expression
        2. forEach(i -> {}) is also lambda expression for advanced forEach
        3. i -> i<12  are also lambda expressions
        4. (l,m) -> l + m are also lamda expressions
        4. we should call the method like obj.test(10) or obj.demo(8)

         */






    }
}
