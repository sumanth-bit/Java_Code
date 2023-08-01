package Generics;

class custom <E extends Number, V extends CustomBoundedMethos>{

    private E num;
    public V value;

    public custom(E num,V value){
        this.num = num;
        this.value = value;
    }
    public E getNum(){ return num;}

    public String toString(){
        return "number is "+num+" Value is "+ value;
    }


}

public class CustomBoundedMethos {

    public static void main(String [] args){
        custom<Float,CustomBoundedMethos> c1 = new custom<>(1.3f,new CustomBoundedMethos());
        System.out.println(c1.getNum());
        c1.value.display(c1);
    }
    public void display(custom c1){
        System.out.println("Here is the app obj"+c1.value);
    }




}
