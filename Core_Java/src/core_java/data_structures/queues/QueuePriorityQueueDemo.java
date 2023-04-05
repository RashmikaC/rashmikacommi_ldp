package core_java.data_structures.queues;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriorityQueueDemo {
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Java");
        pq.add("Is");
        pq.add("Really");
        pq.add("Amazing");
        System.out.println("Initial Queue " + pq);

        pq.remove("Really");
        System.out.println("After Remove " + pq);
        pq.remove();
        System.out.println("After Remove " + pq);

        System.out.println("Poll Method " + pq.poll());

        System.out.println("Final Queue " + pq);

        pq.add("Really");
        pq.add("Amazing");
        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println(pq.peek());
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) , n=size