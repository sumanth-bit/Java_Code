package Core_Java;


// final class cannot be extended
// Final method cannot be overridden
// final variables cannot be modified
final class Final{
    public final int i= 10;
    private final String s;

    Final(){
        s = "Sumanth";

    }


    public final void printString(){
        System.out.println("Hello final class");


    }

    public void show(){
        System.out.println("Hi this is not final method");
    }
}
public class FinalKeyWord {
    public static void main(String args[]){
        Final f = new Final();
        f.show();
        f.printString();
    }

}
