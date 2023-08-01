package Exercises;
import java.util.*;

public class LinkedListExercise {

    public static void main(String args[]){
        List<Integer> l = new LinkedList<Integer>();
        //1. Here we are appending it at the end of Linked List
        l.add(1);
        l.add(2);
        l.add(3);
        // this will add at 2nd position moving the next element to next node
        //Write a Java program to insert the specified element at the specified position in the linked list.
        l.add(2,3);
        // This will replace or update the value at the 4th position
        l.set(3,4);
        display(l);


        // Code -1 This code helps to start printing from a specified Location
        for(Integer i : l){
            if(l.indexOf(i) >= 1){
                System.out.print(i+",");
            }

        }
        System.out.println();

        //Code - 2 using listIterator method of ListIterator

        ListIterator<Integer> it = l.listIterator(2);//--> Set index Position here
        while(it.hasNext()){
            System.out.print(it.next()+",");
        }
        System.out.println();
        //4. Write a Java program to iterate a linked list in reverse order.
        Collections.reverse(l);
        System.out.println(l.getClass());


        //Iterator it2 = l.descendingIterator();

        //Write a Java program to insert elements into the linked list at the first and last positions.

        l.add(0,0);
        l.add(l.size(),100);
        display(l);
        // 9.Write a Java program to insert some elements at the specified position into a linked list.

        List<Integer> l1 = new LinkedList<Integer>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l.addAll(0,l1);
        display(l);

        l.add(100);
        // 10.Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println(l.indexOf(100));
        System.out.println(l.lastIndexOf(100));
        System.out.println("**************");
        //11. Write a Java program to display elements and their positions in a linked list.
        int  j = 0;
        for(Integer i : l){
            System.out.println("Index: "+(j++)+" Value: "+i);
        }
        System.out.println("**************");

        //12. Write a Java program to remove a specified element from a linked list.
        l.remove((Integer)100);
        //13. Write a Java program to remove the first and last elements from a linked list.
        l.remove(0); // l.removeFirst()
        l.remove(l.size()-1); //.l.removeLast()

        //14. Write a Java program to remove all elements from a linked list.
        l1.clear();
        display(l);

        //15. Write a Java program that swaps two elements in a linked list.
        Collections.swap(l,0,2);

        display(l);

        //16. Write a Java program to shuffle elements in a linked list.
        Collections.shuffle(l);
        display(l);

        // 17. Write a Java program to join two linked lists.
        l1.add(5);
        l1.add(6);
        l1.add(7);
        LinkedList<Integer> add2lists = new LinkedList<Integer>();

        add2lists.addAll(l);
        add2lists.addAll(l1);
        display(add2lists);

        //Collections.copy(l,l1);
        //18. Write a Java program to copy a linked list to another linked list.

        display(l);
        List<Integer> copiedList = new LinkedList<Integer>();
        //copiedList = (LinkedList)l.clone();

        //19. Write a Java program to remove and return the first element of a linked list.
        System.out.println(l.remove(0));
        System.out.println("**************");


        //20. Write a Java program to retrieve, but not remove, the first element of a linked list.

        System.out.println(l.get(0));
        System.out.println(l.get(l.size()-1));
        System.out.println("**************");


        display(l);

        //22. Write a Java program to check if a particular element exists in a linked list.

        if(l.contains(0)){
            System.out.println("Yes we have 0");
        }
        // 23. Write a Java program to convert a linked list to an array list.

        List<Integer> arrayList = new ArrayList<>(l);
        display(arrayList);
        System.out.println("**************");


        for(Integer i : add2lists){
            if(l.contains(i)){
                System.out.println("l list contains "+i);
            }
            else{
                System.out.println("l list does not contains "+i);
            }
        }
        //25. Write a Java program to check if a linked list is empty or not.
        System.out.println("**************");

        System.out.println(l.isEmpty());

        System.out.println("**************");
        //26. Write a Java program to replace an element in a linked list.
        l.set(1,0);
        display(l);








    }

    public static void display(List<? extends Object> l){
        for(Object o:l){
            System.out.println(o);
        }
        System.out.println("**************");
    }


}
