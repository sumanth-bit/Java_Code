package Core_Java;
/* Usually Anonymous inner classes are used to provide definition
of the class while creating the object,
we use it mostly to implement the interfaces, abstract class or interfaces
with single methods
 for example we use comparator method
 */

interface Lock{
    boolean isLocked(String s);
}
class Door2 {

    /* Here it looks like as it is creating an instance for the interface
    But it actually creating an anonymous object of class that implements
    Interface
     */
    // PLEASE READ COMMENTS TO UNDERSTAND CODE DEEPLY

    private Lock lock = new Lock(){
        public boolean isLocked(String s){
          if(s.equals("Sumanth")){
              System.out.println("It is opened");
              return false;
          }
          else{
              System.out.println("it is not opened");
              return true;
          }

        }

    };
    public Lock getLock(){
        return lock;
    }
}
public class AnonymousInnerClass{
    public static void main(String args[]){
        Door2 d= new Door2();
        d.getLock().isLocked("Sumanth");

    }
}


