package core_java.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[])
    {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("java");
        ts.add("is");
        ts.add("java");
        ts.add("amazing");
        ts.add("useful");

        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
//ascending order

//Time Complexity: O(n)
//Space Complexity: O(n) , n=size