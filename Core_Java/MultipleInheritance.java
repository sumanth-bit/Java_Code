package Core_Java;

interface Person{
    void human();


}

interface IsAlive{
    void breathe();
}

abstract class Human implements  Person,IsAlive{
    public void human(){
        System.out.println("Yes I'm a human");
    }
    public void breathe(){
        System.out.println("Yes I can breath");
    }
    public abstract void eat();


}
class People extends Human{
    public void eat(){
        System.out.println("Eating is possible");
    }

}

public class MultipleInheritance {
    public static void main(String [] args){
        Human sumanth = new People();
        sumanth.breathe();
        sumanth.eat();
        sumanth.human();
    }

}
