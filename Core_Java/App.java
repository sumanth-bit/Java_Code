package Core_Java;

class Vegan extends AbstractClass{
    public void eat(){
        System.out.println("Eats only Vegetables");
    }

}

class NonVegan extends AbstractClass{
    public void eat(){
        System.out.println("Eats Both Veg and Non veg");
    }
}

public class App {
    public static void main(String args[]){
        AbstractClass ab = new Vegan();
        ab.speak();
        ab.eat();
    }
}
