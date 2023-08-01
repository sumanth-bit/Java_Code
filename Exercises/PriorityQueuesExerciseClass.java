package Exercises;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class PriorityQueuesExerciseClass {

    public static void main(String args[]){
        //1. Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.offer("Yellow");
        pq.offer("Red");
        pq.offer("voilet");
        pq.offer("Green");
        System.out.println(pq);

        //2. Write a Java program to iterate through all elements in the priority queue.
        display(pq);

        //3. Write a Java program to add all the elements of a priority queue to another priority queue.
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.addAll(pq);
        display(pq1);

        //4. Write a Java program to insert a given element into a priority queue.

        pq.add("Blue");

        //5. Write a Java program to remove all elements from a priority queue.
        pq1.clear();

        //6. Write a Java program to count the number of elements in a priority queue.

        System.out.println(pq1.size());
        pq1.addAll(pq);
        pq.add("Brown");


        //7. Write a Java program to compare two priority queues.

        for(String p: pq){
            if(! pq1.contains(p)){
                System.out.println(p+" is not present in pq1");
            }
        }
        display(pq);

        //8. Write a Java program to retrieve the first element of the priority queue.

        System.out.println(pq.peek());

        //9. Write a Java program to retrieve and remove the first element.

        System.out.println(pq.poll()+"\n***************************");
        display(pq);

        //10. Write a Java program to convert a priority queue to an array containing all its elements.
        String[] a = new String[pq.size()];
        pq.toArray(a);

        //11. Write a Java program to convert a Priority Queue element to string representations.

        String str1 = pq.toString();
        System.out.println(str1.charAt(0)+"\n***************************");


        //12. Write a Java program to change priorityQueue to maximum priority queue.

        PriorityQueue<Integer> in = new PriorityQueue<>();

        in.offer(1);
        in.offer(10);
        in.offer(3);
        in.offer(9);
        in.offer(7);
        in.offer(2);

        display(in);
        Integer val;
        while((val = in.poll()) != null){
            System.out.print(val+",");
        }












    }
    public static void display(Queue<? extends Object> l){
        for(Object o:l){
            System.out.println(o);
        }
        System.out.println("**************");
    }
}
