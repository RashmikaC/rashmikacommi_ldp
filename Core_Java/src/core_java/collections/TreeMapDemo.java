package core_java.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the tree map
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);
        treeMap.put("Z", 0);
        treeMap.put("E", 5);
        treeMap.put("D", 4);

        System.out.println(treeMap);

        int valueA = treeMap.get("A");
        System.out.println("Value of A: " + valueA);

        treeMap.remove("B");

        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
        System.out.println(treeMap);
    }
}
//ascending order

//Time Complexity: O(n)
//Space Complexity: O(n) , n=size