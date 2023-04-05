package core_java.array_lists;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] arg)
    {
        ArrayList<String> namesList=new ArrayList<>();
        namesList.add("Ram");
        namesList.add("Ravi");
        namesList.add("Shashi");
        namesList.add("Indu");
        for(int i=0;i<namesList.size();i++)
            System.out.println(namesList.get(i));
        for(String name:namesList)
            System.out.print(name+" ");
        System.out.println();
        System.out.println(namesList);
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) , n=length of array list