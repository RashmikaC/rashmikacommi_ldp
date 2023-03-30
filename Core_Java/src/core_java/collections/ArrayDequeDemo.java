package core_java.collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>(10);

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);

        System.out.println(deque);

        Iterator it=deque.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        deque.clear();

        deque.addFirst(564);
        deque.addFirst(291);

        deque.addLast(24);
        deque.addLast(14);

        System.out.println(deque);
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) , n=length