package core_java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String args[])
    {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "ABC");
        hm.put(2, "EFG");
        hm.put(3, "ABC");

        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) , n=size of hash map