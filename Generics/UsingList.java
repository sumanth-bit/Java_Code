
import java.util.*;

/* All classes should be only classes but shouldn't be public classes except
the class which contains the main method
 */

class Data1 <T>{

    private T myvar;

    public Data1(T data){
        super();
        myvar = data;
    }

    public T getData(){
        return myvar;
    }
    public String toString(){
        return "This is Data class's  attribute "+myvar;
    }
}

 class Data2 <K,T>{

    private K key;
    private T value;

    public Data2(K key,T value){
        this.key = key;
        this.value = value;

    }
    public K getKey(){
        return key;
    }
    public T getValue(){
        return value;
    }


}
/* This is for Printing a different data types Data and we need to
define a separate class for it to use Generic Methods in it
syntax public <T> void name(list <T> l)
 */
class PrintData{
    public <E> void printList(List<E> list) {
        ListIterator<E> l = list.listIterator();
        while (l.hasNext()) {
            System.out.println("Lists elemets are " + l.next());
        }
    }


}

/* we can have object type which takes all of the  data types, But de
declaration should not change
we can have multiple type in Generic classes like Key Value pairs.
*/

public class UsingList {
    public static void main(String args[]){
        List<Data1<Object>> l = new LinkedList<>();
        l.add(new Data1<Object>("Hello"));
        l.add(new Data1<Object>(123));
        l.add(new Data1<Object>(23.44));
        l.add(new Data1<Object>(34.55555555555555));

        PrintData ul = new PrintData();
        ul.printList(l);
        List<Data1<Integer>> l1 = new LinkedList<Data1<Integer>>();
        l1.add(new Data1<Integer>(1));
        ul.printList(l1);

        List<Data2<Integer,String>> l2 = new LinkedList<>();
        l2.add(new Data2<Integer,String>(1,"Sumanth"));
        System.out.println(" Key is "+l2.get(0).getKey()+" Values  IS "+ l2.get(0).getValue());



    }

    }


