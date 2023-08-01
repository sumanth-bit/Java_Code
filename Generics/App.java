package Generics;
class Data{

    private Object obj;
    public Data(Object obj){
        this.obj = obj;
    }
    public Object getObj(){
        return obj;
    }
    public String toString(){
        return "Data [obj = "+ obj + "]";
    }

}

class GenericClass<T>{

    private T data;

    public GenericClass(T data){
        this.data = data;
        }
    public T getData(){
        return data;
    }

    public String toString(){
        return "Generic class data id "+data;
    }

}


public class App {
    public static void main(String args[]){

        GenericClass<String> genericData = new GenericClass<String>("Hi Guys");
        String data = genericData.getData();
        System.out.println(data);
        System.out.println(genericData);

        GenericClass<Data> obj = new GenericClass<Data>(new Data(123));
        System.out.println(obj.getData());

    }

}
