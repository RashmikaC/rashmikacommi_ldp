package core_java.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String args[])
    {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Java");
        lhs.add("is");
        lhs.add("Java");
        lhs.add("awesome");
        lhs.add("useful");

        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
//retains the ordering of the elements

//Time Complexity: O(n)
//Space Complexity: O(n) , n=size