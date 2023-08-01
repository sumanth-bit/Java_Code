// for Saying that these classes are part of package.

package Core_Java;


 class Door{
    private Lock lock;

    Door(){
        lock = new Lock(true);
    }
    Door(boolean x){
        lock = new Lock(x);
    }
    // Constructor which accepts the object of an inner class

     Door(Lock l){
        lock = l;
     }

    public Lock getLock(){
        return lock;
    }
    public void shopStatus(){
        if(lock.lock){
            System.out.println("Shop is closed");
        }
        else {
            System.out.println("Shop is open");
        }
    }
    // This is example for inner class
    //where we have defined a class inside a class,
    // created an object as the attribute in the class
    class Lock{
        private boolean lock;
        Lock(boolean t){
            lock = t;
        }
        public void setLock(boolean x){
            lock = x;
            shopStatus();
        }

        public boolean isLock(){
            return lock;
        }

    }
    static class StaticInnerClass{
        public void printMethod(){
            System.out.println("I'm a static inner class I do not need outclass object to instantiate");
        }
    }
}

public class InnerClass {
    public static void main(String args[]){
        // Create an instance for the outer class
        // Since it is creating the inner class object we can use it further

        Door d = new Door();
        d.shopStatus();
        d.getLock().setLock(false);


        // directly creating object to an inner class
        Door.Lock l = d.new Lock(true);

        Door innerclass = new Door(l);

        // we are not using any outer class object but directly
        //using new after = .

        Door.StaticInnerClass h = new Door.StaticInnerClass();
        h.printMethod();




    }
}
