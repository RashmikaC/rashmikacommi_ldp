package core_java.array_lists;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] arg)
    {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        for(int num:numbers){
            System.out.println(num);
        }
        String someVal="470";
        int numericVal=Integer.parseInt(someVal);
        numericVal+=10;
        System.out.println(numericVal);
        String pi="3.14159";
        double doublePi=Double.parseDouble(pi);
        doublePi+=2.975;
        System.out.println(doublePi);
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n) , n=length of array list