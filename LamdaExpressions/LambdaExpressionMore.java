package LamdaExpressions;

interface Demo1{
    public abstract void  demo();
    default void greet(){
        System.out.println("Hello");
    }
}

interface Demo2{
    public abstract int demo(int x);
}

interface Demo3{
    public abstract int demo(int x, float y);
}
interface Demo4{
    public abstract boolean demo(int x);
}


public class LambdaExpressionMore {

    public static void main(String args[]){
        int x = 100;


       //We are using the Outer class variable in inner class scope
        Demo1 d1 = ()-> System.out.println("The value of Integer is "+ x);

        d1.demo();

        // Here we are passing single parameter to the Lambda expression and returning value

        Demo2 d2 = (int y)->{
            System.out.println("The value provided is  "+ y);
            return y/2;
        };
        System.out.println(d2.demo(23));


        // Here we are sending two parameter checking if it is returning only integer value as  return

        Demo3 d3 = (m,n)->{

            System.out.println(" We can send Two values as parameters");
            System.out.println("They are "+m+" "+n);
            return (int) (m + n);

        };



        System.out.println(d3.demo(12,3.45f));

        // If there is only 1 return statement then we can directly write it there
        Demo4 d4 = y -> y > 1000 ;

        System.out.println(d4.demo(7));

        Demo3 d5 = (l,m) -> (int) (l+m);
        System.out.println(d5.demo(1,2f));





    }
}
