package LamdaExpressions;
import java.util.*;
class Data{
    private String name;

    public Data(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
public class ComparatorLamdaClass {

    public  static void main(String args[]) {

        List<Data> l1 = new ArrayList<Data>();
        l1.add(new Data("Sumanth"));
        l1.add(new Data("Komali"));
        l1.add(new Data("Vani"));
        l1.add(new Data("Balaram"));

        // Type--1 Use Normal Comparator method to sort

        Collections.sort(l1,new Comparator<Data>(){

            public int compare(Data d1, Data d2){
                return d1.getName().compareTo(d2.getName());
            }
        });
        display(l1);


        // Type--2 Use Lambda Expessions

        Collections.sort(l1,(d1, d2)->d1.getName().compareTo(d2.getName()));
        System.out.println("Without data type");
        display(l1);

        // Type-3 using Lambda but different Sorting

        Collections.sort(l1,(Data d1, Data d2)->
        {
            if(d1.getName().length() > d2.getName().length()){ return 1;}
            else if(d1.getName().length() < d2.getName().length()){ return -1;}
            else { return 0;}

        });
        display(l1);



    }

    public static void display(List<? extends Data> l){
        for(Data d : l){
            System.out.println(d.getName());
        }
        System.out.println("*******************");
    }

}
