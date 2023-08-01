package Collections;
import java.security.Key;
import java.util.*;
class KeyValueClass<K,V>
{
    private K key;
    private V value;

    public KeyValueClass(K k,V v){
        key = k;
        value = v;
    }

    public K getKey(){return key;}
    public V getValue(){return value;}

    public String toString(){
        return "Key is "+key+" Value is "+value;

    }



}

class ValueComparator implements  Comparator<KeyValueClass<Integer,String>>{
    public int compare(KeyValueClass<Integer,String> k,KeyValueClass<Integer,String> v){
        return k.getValue().compareTo(v.getValue());
    }

        }

public class ComparatorClass {
    //we use Comparator class to sort the user defined classes

    public static void main(String args[]) {

        Comparator<KeyValueClass<Integer, String>> Compare_Key = new Comparator<>() {
            public int compare(KeyValueClass<Integer, String> kv1, KeyValueClass<Integer, String> kv2) {
                if (kv1.getKey() > kv2.getKey()) {
                    return 1;
                } else if (kv1.getKey() < kv2.getKey()) {
                    return -1;

                } else {
                    return 0;

                }
            }
        };
        Set<KeyValueClass<Integer, String>> s = new TreeSet<>(Compare_Key);
        s.add(new KeyValueClass<>(1, "Sumanth"));
        s.add(new KeyValueClass<Integer, String>(2, "Vani"));
        s.add(new KeyValueClass<Integer, String>(3, "Komali"));
        System.out.println(s);

        List<KeyValueClass<Integer, String>> l = new LinkedList<>();
        l.add(new KeyValueClass<>(1, "Hello"));
        l.add(new KeyValueClass<Integer, String>(2, "Hi"));
        l.add(new KeyValueClass<Integer, String>(3, "Head Ache"));
        Collections.sort(l,new ValueComparator());
        System.out.println(l);




    }

}
