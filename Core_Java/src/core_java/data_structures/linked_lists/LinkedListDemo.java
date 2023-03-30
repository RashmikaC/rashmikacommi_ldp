package core_java.data_structures.linked_lists;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[])
    {
        LinkedList<String> names = new LinkedList<String>();
        names.add("A");
        names.add("B");
        names.addLast("C");
        names.addFirst("D");
        names.add(2, "E");

        System.out.println(names);

        names.set(1, "W");

        System.out.println(names);

        names.remove("B");
        names.remove(3);
        names.removeFirst();
        names.removeLast();

        System.out.println(names);

        names.add("A");
        names.add("B");

        // for loop
        for (int i = 0; i < names.size(); i++) {

            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        // Using the for each loop
        for (String str : names)
            System.out.print(str + " ");
        System.out.println();

    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) , n=size