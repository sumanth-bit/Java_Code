package Exercises.DataStructures;

class Stack{
    public int [] arr;
    public int size;
    public int top;
    Stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;

    }
    public void push(int ele){
        if(top == (size-1)){
            System.out.println("Stack is already Full");
        }
        else{
            top = top + 1;
            arr[top] = ele;
        }

    }
    public  void pop(){
        if(top == -1){
            System.out.println("Under Flow");
        }
        else{

            top = top - 1;
            System.out.println("Item has been poped");

        }

    }
    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return 0;
        }
        else {
            return arr[top];
        }
    }

    public void display(){
        for(int i = top; i >= 0; i--){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }




}


public class StackClass {
    public static void main(String args[]){
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
        if(s.peek() != 0){
            System.out.println("The current top element is "+s.peek());
        }

    }

}
