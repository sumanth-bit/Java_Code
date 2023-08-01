package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeClass {
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedBlockingDeque<>();
        dq.addFirst(1);
        dq.offerFirst(2);
        System.out.println(dq);
        dq.addLast(3);
        dq.offerLast(4);
        dq.addLast(5);
        dq.offerLast(6);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.peekFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.peekLast());
        dq.removeFirst();
        dq.pollFirst();
        System.out.println(dq);
        dq.removeLast();
        dq.pollLast();
        System.out.println(dq);

        //All methods are used please refer them





    }
}
