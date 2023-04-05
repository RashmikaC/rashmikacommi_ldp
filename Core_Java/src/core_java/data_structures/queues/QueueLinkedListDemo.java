package core_java.data_structures.queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListDemo {
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++)
            q.add(i);

        System.out.println("Elements of queue " + q);

        int removedEle = q.remove();
        System.out.println("removed element-" + removedEle);

        System.out.println(q);

        System.out.println("removed element-" + q.poll());
        System.out.println(q);

        //when the queue is empty: the remove() method throws an exception, while the poll() method returns null

        int head = q.peek();
        System.out.println("head of queue-" + head);

        int size = q.size();
        System.out.println("Size of queue-" + size);

        Iterator iterator = q.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) , n=size