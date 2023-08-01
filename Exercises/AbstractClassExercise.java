package Exercises;

abstract class Animal1{
    public abstract void Sound();
}
class Animal{
    public void Breaths(){
        System.out.println("Animal Breaths");
    }
}


class Lion extends Animal1{
    public void Sound(){
        System.out.println("Lion Roars");
    }
    public void eat(){
        System.out.println("Lion loves Eating ");
    }
}
class Dog extends Animal{
    public void Sound(){
        System.out.println("Dog barks ");
    }
    public void eat(){
        System.out.println("Dog hate Eating ");
    }
}

public class AbstractClassExercise {

    public static void main(String args[]){
        Animal1 a = new Lion();
        a.Sound();

        /*
        1. When you are trying to achieve run time polymorphism, overriding is compulsory
        2. Only the methods which are over ridden or already present in parent class be called if
          we use Animal a = new Dog();
         3. Specific Dog class methods cannot be accessed with object 'a',
         4. So Run time polymorphism works only overridden method i.e same signature and same Same parameters
         */
        Animal b = new Dog();


       // b.Sound(); Both do not work
       // b.eat();
        b.Breaths();
    }
}
