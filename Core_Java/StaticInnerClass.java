package Core_Java;
/*
1.Static is a keyword which is used to declare a variable with
that is common for all the objects, which can be accessed directly
or Using class name in the main Class.

2. We need not a create a Outer class object to call static
inner class objects


 */
class Outer{

    private static int x = 0;
    private int k = 1;
    static class Inner{
        private static int in = 1;
        static int l = 7;
        public static void testInnerMethod(){

            System.out.println("Hello this is static method in static Inner class");
            System.out.println(x);
        }

    }

    public static void setX(int k){
        x = k;
    }
    public static int getX(){
        return x;
    }
}

public class StaticInnerClass {
    public static void main(String args[]){
        // 1. Creating a static nested Class object

        Outer.Inner k = new Outer.Inner();
        // Access it's method using object
        k.testInnerMethod();

        //Accessing it's variable using the class name
        System.out.println(Outer.Inner.l);

        //This is example for Normal Static class
        // where we try to access them with a class name
        Outer.setX(23);
        System.out.println(Outer.getX());





    }
}
