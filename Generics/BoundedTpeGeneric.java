package Generics;
import java.util.*;

class bound<E extends Number, S extends String>{
    private E num1;
    private S str2;

    public bound(E num1,S str2){
        this.num1 = num1;
        this.str2 = str2;
    }
    public E getNum1(){
        return num1;
    }
    public S getStr2(){
        return str2;
    }
    public void setNum1(E num1){
        this.num1 = num1;
    }
    public <E extends Number, S extends String> void display(E number, S string){
        System.out.println("The Number is "+ number+ "The string is "+string);
    }
    public String toString(){

        return " Data number is "+ num1 +" String num is "+str2;
    }
    public void show(E num, S str){
        System.out.println("number "+num+" data is "+ str);

    }


}


public class BoundedTpeGeneric {
    public static void main(String args[]) {
        bound<Integer, String> b1 = new bound<>(1, "sumanth");
        System.out.println(b1);
        b1.display(3.5559340834953, "klo");
        List<Object> l1 = new LinkedList<>();
        l1.add("Sumanth");
        l1.add(1223);
        List<Double> l2 = new LinkedList<>();
        l2.add(1.222d);
        display(l1);
        display(l2);




    }
    public static <T> void display(List<T> l ){
        for(T x :l){
            System.out.println(x);
        }
    }
}
