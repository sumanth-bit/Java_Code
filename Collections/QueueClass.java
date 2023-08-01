package Collections;
import java.util.*;
import java.util.concurrent.*;


public class QueueClass {
    public static void main(String args[]){
        Queue <Integer> q= new LinkedBlockingQueue<>();
        q.add(1);
        q.add(5);
        q.add(6);
        q.add(5);
        q.add(6);
        q.offer(7);
        for (Integer i : q){
            System.out.println(i);
        }
        q.remove();
        System.out.println(q);
        Queue <Integer> q1= new ArrayBlockingQueue<>(5);
        q1.add(1);
        q1.add(3);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.offer(10);
        System.out.println(q1);
        System.out.println(q1.peek()); // Gives the first element which is inserted
        q1.poll(); //removes the first element in the queue
        System.out.println(q1);









    }
}
