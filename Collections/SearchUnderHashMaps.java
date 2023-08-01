package Collections;
import java.util.*;

class Code implements Comparable<Code>
{
    private String secId;
    private String lecId;

    public Code(String s,String l){
        this.secId = s;
        this.lecId = l;
    }
    public String getSecId(){return secId;}
    public String getLecId(){return lecId;}

    public String toString(){
        return secId+" "+lecId;
    }
    public int compareTo(Code O){
        return (secId+lecId).compareTo(O.secId+O.lecId);
    }

}

class CustomSortonSection implements Comparator<Code>{
    public int compare(Code s1,Code s2){
        return s2.compareTo(s1);
    }
}
public class SearchUnderHashMaps {
    public static void main(String args[]){
        Map<Code,String> map = new HashMap<>();
        map.put(new Code("S01","L03"),"Generics");
        map.put(new Code("S01","L01"),"Files");
        map.put(new Code("S02","L03"),"Networks");
        map.put(new Code("S01","L03"),"OOPS");
        System.out.println(map);
        for(Map.Entry<Code,String> entry : map.entrySet()) {
            if (entry.getValue().equals("Files")) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println(map);

        //Using Comparable Interface Code object are being sorted

        Map<Code,String> map1 = new TreeMap<>();
        map1.put(new Code("S01","L03"),"A");
        map1.put(new Code("S01","L01"),"B");
        map1.put(new Code("S02","L03"),"C");
        map1.put(new Code("S01","L03"),"d");
        System.out.println(map1);
        for(Map.Entry<Code,String> entry : map1.entrySet()) {
            if (entry.getValue().equals("B")) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println(map1);

        //Now We will use Comparator Interface for it

        Comparator<Code> c= new Comparator<>(){
            public int compare(Code obj1,Code obj2){
                return (obj1.getLecId()+obj1.getLecId()).compareTo(obj2.getLecId()+obj2.getLecId());
            }
        };
        Map<Code,String> map2 = new TreeMap<>(c);
        map2.put(new Code("S11","L12"),"Generics");
        map2.put(new Code("S13","L14"),"Files");
        map2.put(new Code("S10","L09"),"Networks");
        map2.put(new Code("S01","L03"),"OOPS");
        map2.put(new Code("S11","L12"),"Generics");
        System.out.println(map2);
        for(Map.Entry<Code,String> entry : map2.entrySet()) {
            if (entry.getValue().equals("Files")) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println(map2);
        Map<Code,String> map3 = new TreeMap<>(new CustomSortonSection());
        map3.put(new Code("S11","L12"),"Generics");
        map3.put(new Code("S13","L14"),"Files");
        map3.put(new Code("S10","L09"),"Networks");
        map3.put(new Code("S01","L03"),"OOPS");
        System.out.println(map3);
        for(Map.Entry<Code,String> entry : map3.entrySet()) {
            if (entry.getValue().equals("Files")) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println(map3);





    }

}
