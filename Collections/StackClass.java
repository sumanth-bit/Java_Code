package Collections;
import java.util.*;

public class StackClass {
    public static void main(String args[]){

        Stack<Integer> s =  new Stack<>();
        s.push(12);
        s.push(13);
        s.push(13);
        s.push(34);
        s.push(2222);
        StackClass sc = new StackClass();
        sc.printStack(s);
        s.pop();// Remove the top element
        sc.printStack(s);
        System.out.println(s.peek()); // return Top element
        System.out.println(s.empty()); // check empty or not


    }
    public <T> void printStack(Stack<T> s){
        for(T ele: s){
            System.out.println(ele+ " ");

        }
        System.out.println("*************");

    }
}
