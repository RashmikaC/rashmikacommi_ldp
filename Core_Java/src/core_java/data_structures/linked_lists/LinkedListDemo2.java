package core_java.data_structures.linked_lists;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args)
    {
        LinkedList<Integer> list= new LinkedList<Integer>();
        list.add(49);
        list.add(28);
        list.add(33);
        list.add(70);
        System.out.println("LinkedList: "+ list);
        Object[] a = list.toArray();
        System.out.print("After converted LinkedList to Array: ");
        for(Object element : a)
            System.out.print(element+" ");
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) , n=size