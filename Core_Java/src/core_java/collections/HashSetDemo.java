package core_java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String args[])
    {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Java");
        hs.add("is");
        hs.add("Java");
        hs.add("Amazing");
        hs.add("Very cool");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) , n=size of hash set