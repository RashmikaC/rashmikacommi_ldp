package core_java.array_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ParallelArrayLists {
    public static void main(String[] arg) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter name:");
            names.add(input.next());
            System.out.print("Enter age:");
            ages.add(input.nextInt());
            input.nextLine();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(names.get(i)+" is "+ages.get(i)+" years old");
        }
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) , n=length of array list